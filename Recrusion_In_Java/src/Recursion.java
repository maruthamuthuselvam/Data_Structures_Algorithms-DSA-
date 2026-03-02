public class Recursion {
    public static void main(String[] args) {
        System.out.println(recursionCall(5));
    }

    private static int recursionCall(int n) {
        if(n == 0){
            return 2;
        }
        if(n == 1){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        return recursionCall(n-1) + recursionCall(n - 2) + recursionCall(n - 4);
    }

}
