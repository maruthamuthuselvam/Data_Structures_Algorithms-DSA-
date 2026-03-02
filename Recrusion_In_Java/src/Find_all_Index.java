import java.util.ArrayList;

public class Find_all_Index {
    public static void main(String[] args) {
        int[] nums = {1,2,4,4,5,6};
        int target = 4;
        System.out.println(findIndex(nums, 0, target));
    }

     static ArrayList<Integer> findIndex(int[] nums, int i, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(nums.length - 1 == i){
            return arr;
        }
        if(nums[i] == target){
            arr.add(i);
        }
        ArrayList<Integer> ans = findIndex(nums , i + 1, target);
        arr.addAll(ans);
        return arr;
    }
}
