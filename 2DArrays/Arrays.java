public class Arrays {
   public static void main(String[] args) {
    // declaration
    // int[][] arr;
    // //allocation
    // arr = new int[3][4];
    //initialization
    int[][] brr = {
        {1,2},
        {2,3},
        {3,4},
        {5,6}
    };

    int rowLength = brr.length;
    int colLength = brr[0].length;
    for(int i = 0; i<= rowLength-1; i++){
        for(int j = 0; j<= colLength-1; j++){
           System.out.print(brr[i][j] + ",");
        }
        System.out.println();


    }
    

   }    
}
