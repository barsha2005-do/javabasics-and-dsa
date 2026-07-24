public class MinValue {
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4};
    //     int n = arr.length;
    //     int min = arr[0];
    //     for(int i= 0 ; i<= n-1; i++){
    //         if(arr[i]< min){
    //             min = arr[i];
    //         }

    //     }
    //     System.out.println(min);
    // }

    public static int minValue(int[] arr){
       int n = arr.length;
       int min = arr[0];
       for(int i = 0; i <= n-1; i++){
        if(arr[i]< min){
            min = arr[i];
        }
       }
       return min;
    }
    public static void main(String[] args) {
        int[] ans = {1, 2, 3, 4};
        System.out.println(minValue(ans));
    }
}
