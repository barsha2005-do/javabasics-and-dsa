// public class Solution{
//     public static void main(String args []){
//         for (int i=0; i<5; i++){
//           System.out.println("Hllo");
//           i+=2;
//         }
//     }
// }
import java.util.*;
class Solution {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number");
            int x = sc.nextInt();
            boolean isPalindrome = isPalindromeMath(x);

            if (isPalindrome){
                System.out.println(x + " is a palindrome number");
            }
            else{
                System.out.println("is not a palindrom number");
            }
        }
    }

    public static boolean isPalindromeMath(int x){
        if (x<0) return false;

        int original = x;
        int reversed = 0;

        while (x != 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}