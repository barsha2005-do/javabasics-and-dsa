public class SumOfDigit {
    public static void main(String[] args) {
        int digit  = 1234;
        int sum =0;
        int rem = 0;
        while(digit >0){
            rem = digit%10;
            sum = rem +sum;
            digit = digit/10;
        }
        System.out.println(sum);

    }
}
