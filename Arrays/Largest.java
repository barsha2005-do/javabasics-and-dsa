public class Largest {

    public static int getLargest(int[] num){
        int largest= Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if (num.length == 0 || num.length == 1) {
throw new IllegalArgumentException("you need to add the valid amount of elements");
}
        for(int i=0; i<num.length; i++){
            if (largest<num[i]) {
                secondLargest = largest;
                largest = num[i];
            }
            else if (num[i] < largest && num[i] > secondLargest)  {
                secondLargest = num[i];
            }

        }
        if (secondLargest == Integer.MIN_VALUE) {
    throw new IllegalArgumentException("message");
}
        return secondLargest;

    }
    public static void main(String[] args) {
        int num[]= {7,7,99,4};
        System.out.println(getLargest(num));
    }
}
