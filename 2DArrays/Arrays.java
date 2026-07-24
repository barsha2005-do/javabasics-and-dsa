public class Arrays {
   public static void main(String[] args) {
    // declaration
    // int[][] arr;
    // //allocation
    // arr = new int[3][4];
    //initialization
    int[][] brr = {
        {1,2, 2, 3, 4,},
        {2,3,3 ,4 },
        {3,4,5,},
        {5,6}
    };

    
    
    for(int i = 0; i<= brr.length-1; i++){
        int colLength = brr[i].length;
        for(int j = 0; j<= colLength-1; j++){
           System.out.print(brr[i][j] + ",");
        }
        System.out.println();


    }
    

   }    
}
