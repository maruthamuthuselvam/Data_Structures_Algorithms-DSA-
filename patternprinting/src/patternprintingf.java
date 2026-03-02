public class patternprintingf {
    public static void main(String[] args) {
        int val = 5;
        printpattern(val);

    }
    static  void printpattern(int val) {
        for (int row = 1; row <= val; row++) {
            for (int j = 1; j <= val-(row - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
