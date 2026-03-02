public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {
        //int[] nums = {1,1,3,3,4,5,5,8,8,9,9};
       // int[] nums = {1,1,2,3,3,4,4,8,8};
       // int[] nums = {1,1,2,3,3};
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(BinarySearch(nums));
    }
    static int BinarySearch(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(start == end || nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            else if(mid % 2 == 0){
                if( mid > 0 && nums[mid] != nums[mid - 1]){
                    start = mid + 1;
                }
                else{
                    end = mid - 2;
                }
            }
            else{
                if(mid > 0 && nums[mid] == nums[mid - 1]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
