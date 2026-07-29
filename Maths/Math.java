public class Math {


    public static int SumOfDigits(int num){
    int sum = 0;
    while (num!=0) {
        int digit = num%10;
        sum = sum*10 +digit;
        num = num/10;
    }
    return sum;
}
    public static void main(String[] args) {
        int num = 5321;
        int ans  = SumOfDigits(num);
        System.out.println(ans);
    }
    

// public static int CountDigits(int num){
//     int count = 0;
//     while (num!=0) {
//         int digit = num%10;
//         count++;
//         num = num/10;
//     }
//     return count;
// }
//     public static void main(String[] args) {
//         int num = 5321;
//         int ans  = CountDigits(num);
//         System.out.println(ans);
//     }

//     public static void PrintDigits(int num){
//        while(num!=0){
//           int digit = num%10;
//           System.out.println(digit);
//           num = num/10;

//        }
//     }
//    public static void main(String[] args) {
//      int ans = 52134;
//      PrintDigits(ans);
//    }    
}
