public class pattern {
    public static void main(String[] args){
        // int n = 4;
        // for(int row=1; row<=n; row++){
        //     for(int col=1; col<=n; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 3;
        // for (int row=1; row<=n; row++){
        //     for (int col=1; col<=5; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

// int n= 5;
// for(int row=1; row<=n; row++){
//     for(int col=1; col<=row; col++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }

           int n = 5;
           for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
           }

    }
}