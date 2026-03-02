
//man this program is get executed and i dont know how is this get accepted at all bcz i tried a several times but this
//this time its submitted and i super satisified now. stay hard and keep trying;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {3,1,1};
        System.out.println(BinarySearch(nums));
    }

    static int BinarySearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start == end) {
                return nums[mid];
            }
            if(mid != 0 && mid != nums.length-1 && nums[mid] < nums[mid+1] && nums[mid] < nums[mid - 1] ){
                return nums[mid];
            }
            else if(nums[mid] >= nums[start] && nums[mid] >= nums[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return nums[end+1];
    }
}
