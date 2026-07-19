public class ReturnType {
   
    public static void tableofTwo(){
        for(int i =1; i<=10; i++){
            System.out.println(i*2);
        }
    }

    public static int square(int number){
        int result = number * number;
        return result;
    }

   public static void main(String[] args){
tableofTwo();
int answer = square(5);
System.out.println(answer);
   } 
}
