public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] nums = {1,2,5,7,11};
        int k = 2;
        System.out.println(BinarySearch(nums,k));
    }
    static int BinarySearch(int[] nums, int k){
      /*  int start = 0;
        int end = nums.length - 1;
        int position = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(start == end && end + 1 == nums[end]){
                return nums[end] + k;
            }
            if(start + 1 == end ){
                if(position > k){
                    return nums[start] + (position - k);
                }
                return nums[start] + (k - position);
            }
            else if(nums[mid] != mid+1) {
                position = nums[mid] - (mid + 1);
                if (position >= k) {
                    end = mid;
                } else {
                    start = mid ;
                }
            }
                else{
                    start = mid;
                }
            }
        return -1;*/
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            int missing = nums[mid] - (mid + 1);
            if(missing < k){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start + k;
    }

}

