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

    // public static void main(String[] args) {
    // int digit = 121;
    // int original = digit;
    // int rev = 0;
    // while(digit>0){
    // int rem = digit%10;
    // rev = rev * 10 + rem;

    // digit = digit/10;

    // }
    // if(original == rev){
    // System.out.println(rev + " it's a palindrome number");
    // }
    // else{
    // System.out.println(rev + " nota a palindrome number");
    // }

    // }

    // public static void main(String[] args) {
    // int digit = 978;

    // int even = 0;
    // int odd = 0;
    // if (digit == 0) {
    // even = 1;
    // } else {
    // while (digit > 0) {
    // int rem = digit % 10;
    // if (rem % 2 == 0) {
    // even++;
    // } else {
    // odd++;
    // }
    // digit = digit / 10;
    // }
    // }
    // System.out.println(even);
    // System.out.println(odd);
    // }

    // public static void main(String[] args) {
    // int digit = 778779;
    // int count = 0;
    // int target = 7;
    // while (digit > 0) {
    // int rem = digit % 10;
    // if (target == rem) {
    // count++;
    // }
    // digit = digit / 10;

    // }
    // System.out.println(count);
    // }

    // public static void main(String[] args) {
    // int digit = 1333488999;
    // int max = Integer.MIN_VALUE;
    // int min = Integer.MAX_VALUE;
    // int count = 0;
    // if (digit == 0) {
    // max = 0;
    // min = 0;
    // } else {
    // while (digit > 0) {
    // int rem = digit % 10;
    // if (rem > max) {
    // max = rem;
    // count = 1;

    // } else if (rem == max) {
    // count++;
    // }

    // if (rem < min) {
    // min = rem;
    // }
    // digit = digit / 10;
    // }
    // }
    // System.out.println(max);
    // System.out.println("here max appers " + count + " times");
    // System.out.println(min);
    // }
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
