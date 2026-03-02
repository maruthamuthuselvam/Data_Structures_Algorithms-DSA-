import java.util.Arrays;

public class Sort_Array_By_Parity {
    public static void main(String[] args) {
        int[] nums = {1,3,4,4,5,7,7,8,5,9};
        System.out.println(Arrays.toString(SortArray(nums)));
    }
    static int[] SortArray(int[] nums){
        int set = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] % 2 == 0){
                int temp = nums[set];
                nums[set] = nums[i];
                nums[i] = temp;
                set++;
            }
        }
        return nums;
    }
}
