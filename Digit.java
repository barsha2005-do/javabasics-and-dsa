public class Digit {
    public static void main(String[] args) {
        int digit = 1234;
        int evenCount= 0;
        int oddCount = 0;
        
        while(digit>0){
            int lastDigit = digit%10;
            
            if(lastDigit%2 ==0){
                evenCount++;
                
                
            }
            else{
                oddCount++;
                
            }
            digit = digit/10;
        }
     System.out.println(evenCount);
    System.out.println(oddCount);   
    }
    
}
