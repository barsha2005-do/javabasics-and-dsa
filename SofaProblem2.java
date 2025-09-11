import java.util.*;

class SofaProblem2 {

    static class State {
        int x, y, dir, steps;
        State(int x, int y, int dir, int steps) {
            this.x = x;
            this.y = y;
            this.dir = dir; // 0 = horizontal, 1 = vertical
            this.steps = steps;
        }
    }

    static int M, N;
    static char[][] grid;
    static boolean[][][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        for (int t = 1; t <= T; t++) {
            M = sc.nextInt();
            N = sc.nextInt();
            sc.nextLine();

            grid = new char[M][N];
            List<int[]> start = new ArrayList<>();
            List<int[]> end = new ArrayList<>();

            for (int i = 0; i < M; i++) {
                String row = sc.nextLine().trim();
                for (int j = 0; j < N; j++) {
                    grid[i][j] = row.charAt(j);
                    if (grid[i][j] == 's') start.add(new int[]{i, j});
                    if (grid[i][j] == 'S') end.add(new int[]{i, j});
                }
            }

            if (start.size() < 2 || end.size() < 2) {
                System.out.println("Impossible");
                continue;
            }

            // Identify starting orientation and normalize anchor to left/top cell
            int s1x = start.get(0)[0], s1y = start.get(0)[1];
            int s2x = start.get(1)[0], s2y = start.get(1)[1];
            int dir;
            int sx, sy;
            if (s1x == s2x) { // horizontal
                dir = 0;
                sx = s1x;
                sy = Math.min(s1y, s2y);
            } else { // vertical
                dir = 1;
                sy = s1y; // same column
                sx = Math.min(s1x, s2x);
            }

            // Target orientation; store both target cells
            int e1x = end.get(0)[0], e1y = end.get(0)[1];
            int e2x = end.get(1)[0], e2y = end.get(1)[1];
            int edir;
            if (e1x == e2x) edir = 0; else edir = 1;

            visited = new boolean[M][N][2];

            int ans = bfs(sx, sy, dir, e1x, e1y, e2x, e2y, edir);
            if (ans == -1) System.out.println("Impossible");
            else System.out.println(ans * 2);
        }
    }

    static int bfs(int sx, int sy, int dir, int e1x, int e1y, int e2x, int e2y, int edir) {
        Queue<State> q = new LinkedList<>();
        q.add(new State(sx, sy, dir, 0));
        visited[sx][sy][dir] = true;

        while (!q.isEmpty()) {
            State cur = q.poll();

            // Check goal
            if (matches(cur, e1x, e1y, e2x, e2y, edir)) return cur.steps;

            // Try 4 moves
            for (int[] d : new int[][]{{1,0},{-1,0},{0,1},{0,-1}}) {
                int nx = cur.x + d[0];
                int ny = cur.y + d[1];
                if (canPlace(nx, ny, cur.dir)) {
                    if (!visited[nx][ny][cur.dir]) {
                        visited[nx][ny][cur.dir] = true;
                        q.add(new State(nx, ny, cur.dir, cur.steps + 1));
                    }
                }
            }

            // Try rotation
            int ndir = 1 - cur.dir;
            if (canRotate(cur.x, cur.y)) {
                if (!visited[cur.x][cur.y][ndir]) {
                    visited[cur.x][cur.y][ndir] = true;
                    q.add(new State(cur.x, cur.y, ndir, cur.steps + 1));
                }
            }
        }
        return -1;
    }

    // Check if sofa can be placed at (x,y) with orientation dir
    static boolean canPlace(int x, int y, int dir) {
        if (dir == 0) { // horizontal
            if (y + 1 >= N) return false;
            return isFree(x, y) && isFree(x, y + 1);
        } else { // vertical
            if (x + 1 >= M) return false;
            return isFree(x, y) && isFree(x + 1, y);
        }
    }

    // Check if 2x2 area free for rotation
    static boolean canRotate(int x, int y) {
        if (x + 1 >= M || y + 1 >= N) return false;
        return isFree(x, y) && isFree(x+1, y) && isFree(x, y+1) && isFree(x+1, y+1);
    }

    static boolean isFree(int x, int y) {
        if (x < 0 || y < 0 || x >= M || y >= N) return false;
        return grid[x][y] != 'H';
    }

    static boolean matches(State s, int e1x, int e1y, int e2x, int e2y, int edir) {
        if (s.dir != edir) return false;
        int c1x, c1y, c2x, c2y;
        if (s.dir == 0) { // horizontal
            c1x = s.x; c1y = s.y;
            c2x = s.x; c2y = s.y + 1;
        } else { // vertical
            c1x = s.x; c1y = s.y;
            c2x = s.x + 1; c2y = s.y;
        }
        boolean matchDirect = (c1x == e1x && c1y == e1y) && (c2x == e2x && c2y == e2y);
        boolean matchSwapped = (c1x == e2x && c1y == e2y) && (c2x == e1x && c2y == e1y);
        return matchDirect || matchSwapped;
    }
}