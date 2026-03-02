public class patternprintingE {
    public static void main(String[] args) {
        int val = 5;
        pattern(val);
    }
   static void pattern(int val){
        for(int i = 1; i <= (val * 2) - 1; i++){
            int rowchange = i < val ? i : (val * 2) - i;
            for(int j = 1; j <= rowchange; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
