public class BitManipulation{
    public static void binToDec(int binNum){
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int lastdig = binNum %10;
            decNum = decNum + (lastdig * (int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of" + binNum + " = " + decNum);
    }

    public static void main (String args[]){
       binToDec(101);
    }
}