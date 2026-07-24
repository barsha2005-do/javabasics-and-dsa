import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int arr2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        int n2 = arr2.length;
        int sum = 0;
        for(int i = 0; i<= n-1;i++ ){
            arr[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
            int value = arr[i];
            int value2 = arr2[i];
            sum = value + value2;
        }
        System.out.println(sum);
    }
}
