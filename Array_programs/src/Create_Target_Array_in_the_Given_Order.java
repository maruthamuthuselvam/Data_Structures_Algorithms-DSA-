import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(SwapIndex(nums, index)));
    }
    static  int[] SwapIndex(int[] nums,int[] index){
        int num = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr1 = new int[nums.length];
        for(int i = 0; i < nums.length;i++) {
            arr.add(index[i], nums[i]);
        }
        for(int j = 0; j < arr.size(); j++){
            arr1[j] = arr.get(j);
        }

        return arr1;
    }
}
