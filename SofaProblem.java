import java.util.*;

class SofaProblem {

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
        M = sc.nextInt();
        N = sc.nextInt();
        sc.nextLine();

        grid = new char[M][N];
        List<int[]> start = new ArrayList<>();
        List<int[]> end = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String[] row = sc.nextLine().trim().split("");
            for (int j = 0; j < N; j++) {
                grid[i][j] = row[j].charAt(0);
                if (grid[i][j] == 's') start.add(new int[]{i, j});
                if (grid[i][j] == 'S') end.add(new int[]{i, j});
            }
        }

        // Identify starting orientation
        int sx = start.get(0)[0], sy = start.get(0)[1];
        int dir;
        if (start.get(0)[0] == start.get(1)[0]) dir = 0; // horizontal
        else dir = 1; // vertical

        // Target orientation
        int ex = end.get(0)[0], ey = end.get(0)[1];
        int edir;
        if (end.get(0)[0] == end.get(1)[0]) edir = 0; else edir = 1;

        visited = new boolean[M][N][2];

        int ans = bfs(sx, sy, dir, ex, ey, edir);
        if (ans == -1) System.out.println("Impossible");
        else System.out.println(ans);
    }

    static int bfs(int sx, int sy, int dir, int ex, int ey, int edir) {
        Queue<State> q = new LinkedList<>();
        q.add(new State(sx, sy, dir, 0));
        visited[sx][sy][dir] = true;

        while (!q.isEmpty()) {
            State cur = q.poll();

            // Check goal
            if (matches(cur, ex, ey, edir)) return cur.steps;

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

    static boolean matches(State s, int ex, int ey, int edir) {
        // Check if sofa's two cells equal target two cells
        if (s.dir != edir) return false;
        if (s.dir == 0) {
            return (s.x == ex && s.y == ey) || (s.x == ex && s.y+1 == ey);
        } else {
            return (s.x == ex && s.y == ey) || (s.x+1 == ex && s.y == ey);
        }
    }
}