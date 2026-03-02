import java.util.Arrays;

public class Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2,2,3};
        int[] ans = new int[nums.length];
        checkFrequency(nums, ans);
        System.out.println(Arrays.toString(nums));
    }

    private static void checkFrequency(int[] nums, int[] ans) {
        int count = 0;
        int value = 0;
        int min =101;
        for(int i = 0; i < nums.length;++i){
            ans[nums[i]] += 1;
        }
        for(int i = 0;i < ans.length; i++){
            if(ans[i] == 0){
                continue;
            }
            min = 101;
        for(int j = 0; j < ans.length; j++) {
            if(j == ans.length - 1) {
                addToResArr( min, value, count,nums);
                count += min;
            }
            if (ans[j] == 0) continue;
           if(min >= ans[j]){
                min = ans[j];
                value = j;
            }

        }
        }
    }

    private static void addToResArr(int times, int value,int count,int[] nums) {
        for(int i = 0;i < times; i++) {
            nums[count] = value;
        }
    }
}
