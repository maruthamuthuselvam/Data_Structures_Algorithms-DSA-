public class Sum_of_The_digits {
    public static void main(String[] args) {
        int num = 65;
        System.out.println(Digits_sum(num));
    }
    static int Digits_sum(int num){
        //int count = (int) (Math.floor(Math.log10(num)) + 1);
        int count = 0;
        return  helper(count , num);
    }
    static int helper(int count, int num){
        if(num == 0){
            return count;
        }
        count = count + num % 10;


        return helper(count,num/10);
    }
}
