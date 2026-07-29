public class Math {

    public static void PrintDigits(int num){
       while(num!=0){
          int digit = num%10;
          System.out.println(digit);
          num = num/10;

       }
    }
   public static void main(String[] args) {
     int ans = 52134;
     PrintDigits(ans);
   }    
}
