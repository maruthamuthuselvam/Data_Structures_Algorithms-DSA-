public class patternprintingI {
    public static void main(String[] args) {
        int val = 5;
        printpattern(val);
    }
    static void printpattern(int val){
        for(int i = 1; i <= val; i++){
            for(int j=1; j <= (val - i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (i * 2) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
