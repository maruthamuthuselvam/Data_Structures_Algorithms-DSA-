public class Find_Minimum_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        //int[] nums = {0,1,4,4,5,6,7};
        //int[] nums = {10,1,10,10,10};
       int[] nums = {4,5,6,7,0,1,4};
        System.out.println(BinarySearch(nums));
    }
    static int BinarySearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[end]) {
                // minimum is in the left half (including mid)
                end = mid;
            }
            else if (nums[mid] > nums[end]) {
                // minimum is in the right half
                start = mid + 1;
            }
            else {
                // nums[mid] == nums[end] -> duplicates, shrink end
                end--;
            }
        }
        return nums[start];
    }

}
