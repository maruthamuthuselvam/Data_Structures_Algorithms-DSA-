public class patternprintingK {
    public static void main(String[] args) {
        int val = 5;
        printpattern(val);

    }
    static void printpattern(int val) {
        for (int i = 1; i <= (val * 2) ; i++) {
            int space = i <= val ? i-1 : (val * 2)-i;
            int valchange = i <= val ? val-i : (i-val)-1;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= valchange; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
