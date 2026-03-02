public class Fibonnaci_series {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(fibo(num));
    }
    static int fibo(int n){
        if(n <= 2){
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
