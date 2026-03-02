import java.util.Arrays;

public class Minimum_and_Maximum_elements_Using_Recursion {
    public static void main(String[] args) {
       // int[] nums = {1,3,4,-5,8,-9,12,2};
        int[] nums = {1};
        int[] result = new int[2];
        int ans = 0;
        int i = 0;
        findMinimum(nums, result, ans, i);
        findMaximum(nums, result, ans, i);
        System.out.println(Arrays.toString(result));

    }

     static void findMinimum(int[] nums, int[] result, int ans, int i) {
        if(i == nums.length) {
            result[0] = ans;
            return;
        }
        if(nums[i] < ans){
            ans = nums[i];
        }
        findMinimum(nums, result, ans, i + 1);
    }



     static void findMaximum(int[] nums, int[] result, int ans, int i) {
         if(i == nums.length) {
             result[1] = ans;
             return;
         }
         if(nums[i] > ans){
             ans = nums[i];
         }
         findMaximum(nums, result, ans, i + 1);
    }
}
