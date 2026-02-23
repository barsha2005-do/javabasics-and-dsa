public class MethodScope {
    static int number = 10;

    public static void main (String args[]){
        if (true){
            System.out.println(number + " Visible here");  // it won't throw error
        }
        
    }

    public static void showMessage(){
        System.out.println(number);
    }
}
