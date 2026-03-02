
//this program works really fine,run in 1ms,The time complexity is log(n).
//the thing in this program is need to find the sum of number the formula is n(n+1)/2.
public class Find_row {
    public static void main(String[] args) {
        long n = 1804289383;
        long sum = 0;
        System.out.println(findnum(n,sum));
    }
       static int findnum (long n,long sum){
            for (int i = 1; i < n; i++) {
                sum += i;
                //System.out.println(sum);
                if (n < sum) {
                    return i;

                } if (n == sum) {
                        return i;
                }
            }
            return -1;
    }
    /*static long findnum(long n){
        long start = 1;
        long end = n;
        long ans = 0;
        long sum = 0;
        while(start <= end){
            long mid = start + (end - start) / 2;
            sum = mid * ( mid + 1) / 2;
            if(n == sum){
                return mid;
            }
            else if(n < sum){
                end = mid - 1;
                ans = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return ans;
    }*/
}

