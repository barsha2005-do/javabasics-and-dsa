public class MagicNumber {

    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        while(num>0){
           sum = sum + num %10;
           num = num/10;

           if (num==0 && sum>9){
            num = sum;
            sum = 0;

           }
        }
        if (sum == 1){
            System.out.println("it's a magic number");

        }
        else{
            System.out.println("it's not a magic number");
        }

    }
}
