import java.util.Arrays;

public class Recursive_Bubble_Sort {
    public static void main(String[] args) {
        int[] nums = {64, 34, 25, 12, 22, 11, 90};
        int i = nums.length;
        int j = 0;
        BubbleSort(nums, i, j);
    }

   static void BubbleSort(int[] nums, int i, int j) {
        if(i == 0){
            System.out.println(Arrays.toString(nums));
            return;
        }
        if(j >= nums.length - 1){
            j = 0;
            i--;
        }
        if(j + 1 < nums.length && nums[j] > nums[j+1]){
            int temp = nums[j];
            nums[j] = nums[j+1];
            nums[j+1] = temp;
        }
        BubbleSort(nums, i,j+1);
    }
}
