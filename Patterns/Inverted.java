class Inverted{
    public static void main (String args[]){
        for(int line = 1; line <= 4; line++){
            for (int stars = 1; stars <= 4- line +1 ; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}