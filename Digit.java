// public class Digit {
//     public static void main(String[] args) {
//         int digit = 1234;
//         int evenCount= 0;
//         int oddCount = 0;
        
//         while(digit>0){
//             int lastDigit = digit%10;
            
//             if(lastDigit%2 ==0){
//                 evenCount++;
                
                
//             }
//             else{
//                 oddCount++;
                
//             }
//             digit = digit/10;
//         }
//      System.out.println(evenCount);
//     System.out.println(oddCount);   
//     }
    
// }


// public class Digit {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num");
//         int num = sc.nextInt();
        
//         int sum = 0;

//         for(int i = 0; i<=num; i++){
//             sum = sum+i;
//         }

//         System.out.println(sum);

        
//     }
// }

// public class Digit {

//     public static void main(String[] args) {
//         int num = 718;
//         int sum = 0 ;
//         int rem = 0;
//         while(num>0){
//             rem = num%10;
//             sum = rem + sum;

//             num = num/10;
//         }
//         System.out.println(sum);

//     }
// }

public class Digit {

    public static void main(String[] args) {
        int digit = 121;
        int original = digit;
        int rev = 0;
        while(digit>0){
            int rem = digit%10;
            rev = rev * 10 + rem;
           
            digit = digit/10;
            

        }
        if(original == rev){
            System.out.println(rev + "  it's a palindrome number");
        }
        else{
            System.out.println(rev + "  nota a palindrome number");
        }
        
    }
}