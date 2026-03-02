public class Find_Peak_Element {
    public static void main(String[] args) {
        int[] nums = {6,5,4,3,2,3,2};
        System.out.println(BinarySearch(nums));
    }

    static int BinarySearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid is part of a rising slope, peak is on the right
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            }
            // Else peak is on the left (could be mid)
            else {
                end = mid;
            }
        }

        // start == end → peak index
        return start;
    }
}
