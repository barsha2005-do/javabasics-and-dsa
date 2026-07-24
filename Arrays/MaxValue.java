public class MaxValue {

    // public static void main(String[] args) {
    //     int arr[] = {2, 20, 40, 50};
    //     int n = arr.length;
    //     int maxValue = arr[0];
    //     for(int i = 0; i<= n-1; i++ ){
    //         if(arr[i]> maxValue){
    //             maxValue = arr[i];
    //         }
    //     }
    //     System.out.println(maxValue);
    // }

    public static int maxValue(int arr[]){
        int n = arr.length;
        int maximum = arr[0];
        for(int i = 0; i <= n-1; i++){
            if(arr[i]> maximum){
                maximum = arr[i];
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        int[] ans = {1, 20, 30, 40};
        System.out.println(maxValue(ans));
    }
}