import java.util.Scanner;

public class InputArrays {
       public static void main(String[] args) {
        int[][] arr= new int[3][4];
        int sum = 0;
        int mul = arr.length;
        Scanner sc= new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<= arr.length-1; i++){
        int colLength = arr[i].length;
        for(int j = 0; j<= colLength-1; j++){
            int value = arr[i][j];
            sum = sum+value;
            mul = mul*value;
           System.out.print(arr[i][j] + ",");
        }
        System.out.println(mul);


    }
       }
}
