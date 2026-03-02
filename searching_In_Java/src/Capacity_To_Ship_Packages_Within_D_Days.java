public class Capacity_To_Ship_Packages_Within_D_Days {
    public static void main(String[] args) {
        int[] weights = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(FindtheminTime(weights, days));
    }
    static int FindtheminTime(int[] weights, int days) {
        int start = FindMax(weights);
        int end = FindSum(weights);
        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (count_days(weights, days, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        //ans += end/2;
        return ans;
    }
static int FindSum(int[] weights){
        int sum = 0;
        for(int w:weights){
            sum += w;
        }
        return sum;
    }
    static int FindMax(int[] weights) {
        int max = weights[0];
        for (int i = 1; i < weights.length; i++) {
            if (weights[i] > max) {
                max = weights[i];
            }
        }
        return max;
    }

    static boolean count_days(int[] weights, int days, int capacity) {
        int currentdays = 1;
        int current = 0;
        for(int w : weights){
            if(current + w <= capacity){
                current += w;
            }
            else{
                currentdays++;
                current = w;
            }
        }
        return currentdays <= days;
    }
}


