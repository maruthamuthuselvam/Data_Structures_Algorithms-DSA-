public class patternprintingJ {
    public static void main(String[] args) {
        int val = 5;
        printpattern(val);
    }
    static void printpattern(int val){
        for(int i = 1; i <= (val * 2) - 1; i++){
            int rowchange = i <=  val ? (i*2)-1 : (((val * 2) - i) * 2) - 1;
            int space = i <= val ? (val - i) :  (i - val);
            for(int k = 1; k <= space; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= rowchange ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
