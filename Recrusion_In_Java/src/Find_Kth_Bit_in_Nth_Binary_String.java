public class Find_Kth_Bit_in_Nth_Binary_String {
    public static void main(String[] args) {
        int n = 4;
        int k = 11;
        int i = 0;
        i = (n >> k) & 1;
        if(i == 1){
            i = 0;
        }
        else{
            i = 1;
        }
        System.out.println(i);
    }
}
