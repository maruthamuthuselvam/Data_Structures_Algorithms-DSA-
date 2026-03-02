public class patternprintingM {
    public static void main(String[] args) {
        int val = 5;
        printpattern(val);
    }
    static void printpattern(int val){
        for(int i = 1; i <= val * 2; i++){
            int rowchange = i <= val ? i : (val * 2) - (i - 1) ;
            for(int k = 1; k <= val * 2; k++){
                if(k <= val-(rowchange - 1) || k > val + rowchange - 1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}