//leetcode: 33 problem Search_in_Rotated_Sorted_Array.

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        //int[] nums = {4,5,6,7,0,1,2};
        int[] nums = {1,0,1,1,1};
        //int [] nums = {1};
        int target = 0;
        System.out.println(BinarySearch(nums, target));
    }

    static boolean BinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
          /*
          // for search in rotated sorted array 2.
           if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }
           */
             else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return false;
    }
}
