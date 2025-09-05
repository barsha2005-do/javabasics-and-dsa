import java.util.Scanner;

public class Intigers{
   public static void main(String[] args) {
       int n;
       int oddSum =0;
       int evenSum =0;

       try (Scanner sc = new Scanner(System.in)) {
           System.out.println("please provide how many number to check as input");

           n = sc.nextInt();
       System.out.println("You have provided number "+n+" as input");
       
       for(int i = 1; i <= n; i++){
           System.out.println("Enter number " + i + ":");
           int num = sc.nextInt();
           if(num % 2 == 0){
               evenSum += num;
           } else {
               oddSum += num;
           }
       }
       
       System.out.println("Sum of even numbers: " + evenSum);
       System.out.println("Sum of odd numbers: " + oddSum);
       }
   }
}