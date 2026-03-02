public class PrintElement_1_to_N {
    public static void main(String[] args) {
            int n = 10;
            int i = 1;
            PrintNums(n, i);
        }
       static void PrintNums(int n , int i){
            if(i == n){
                return;
            }
            System.out.print(i+" ");
            PrintNums(n , i+1);
        }
    }
