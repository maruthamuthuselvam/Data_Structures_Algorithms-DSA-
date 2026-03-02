import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] nums = {6,5,4,3,2,1};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort(int[] nums, int low, int high) {
        if(low >= high){
            return;
        }
        int i = low;
        int j = high;
        int mid = low + (high - low) / 2;
        int pivot = nums[mid];
        while(i <= j){
            while(nums[i] < pivot){
                i++;
            }
            while(nums[j] > pivot){
                j--;
            }
            if(i <= j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(nums, low, j);
        quickSort(nums, i, high);
    }
}
