public class Execution {

    public static int Table(int table){
        for(int i=1; i<=10; i++){
            int reuslt = i * table;
            System.out.println(reuslt);
        }
        return table;
    }
    public static void Hello(){
        System.out.println("Hey you are in Hello Method");
        System.out.println("Helloooooo");
    }

    public static void main(String[] args){
        System.out.println("you are in main method");
        int ans = Table(15);
        System.out.println(ans);
        Hello();
        System.out.println("Now you are again in main method");
    }
}
