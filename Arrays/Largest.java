public class Largest {

    public static int[] getLargest(int[] num){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if (largest<num[i]) {
                largest = num[i];
            }
        }
        return num;

    }
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5,6};
        System.out.println(getLargest(num));
    }
}
