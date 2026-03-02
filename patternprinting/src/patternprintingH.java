public class patternprintingH {
    public static void main(String[] args) {
        int val = 5;
        printpattern(val);
    }
    static void printpattern(int val){
        for(int i = 1; i <= val; i++){
            for(int j = 1; j <= i - 1;j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (val - i) + 1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
