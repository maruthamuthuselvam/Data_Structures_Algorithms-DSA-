public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,4,3,2,1};
        System.out.println(BinarySearch(nums));
    }
    static int BinarySearch(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid > 0 && mid < nums.length - 1 && nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                return mid;
            }
            else if(mid < nums.length - 1 && nums[mid] > nums[mid + 1]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
