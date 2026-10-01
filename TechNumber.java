//wap to check whether a number is tech number or not.
public class TechNumber {
    public static void main(String[] args) {
        int n = 2025;
        int temp = n;
        int count = 0;

        while(temp>0){
           count ++;
           temp = temp/10;
        }

        if(count %2 ==0){
            
            int divisior = 1;

            for(int i = 0; i<count/2; i++){
                divisior = divisior *10;
            }

            int first = n/divisior;
            int second  = n%divisior;

            int sum = first +second;
            if(sum * sum == n){
               System.out.println("it's a tech number");
            }
            else{
                System.out.println("not a tech number");
            }
        }
        else{
            System.out.println("not a tech number");
        }
    }
}
