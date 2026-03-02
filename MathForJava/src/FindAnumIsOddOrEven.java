public class FindAnumIsOddOrEven {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(oddoreven(n));
    }
    static boolean oddoreven(int n){
        return (n & 1) == 0;
    }
}
