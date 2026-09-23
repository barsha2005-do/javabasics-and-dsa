public class Largest {

    public static int getLargest(int[] num){
        int largest= num[0];
        for(int i=0; i<num.length; i++){
            if (largest<num[i]) {
                largest = num[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5,6};
        System.out.println(getLargest(num));
    }
}
