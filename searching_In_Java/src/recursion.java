public class recursion {
    public static void main(String[] args) {
        int n = 49;
        System.out.println(recursioncall(n));
    }
    static int recursioncall(int n){
        if(n <= 2){
            return 1;
        }

        return recursioncall(n-2) + recursioncall(n-1);
    }
}
