import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums = {4,9,5,9,3,9};
        int[] nums2 = {2,3,4,2,9,9,9,9};
        System.out.println(Arrays.toString(findArray(nums, nums2)));
    }
   static int[] findArray(int[] nums,int[] nums2){
        Arrays.sort(nums);
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
       ArrayList<Integer> arr1 = new ArrayList<>();
            for(int i = 0; i < nums.length;i++){
                for(int j = 0;j < nums2.length;j++){
                    if(i != 0 && nums[i] == nums[i - 1]){
                        break;
                    }
                    else if(nums[i] == nums2[j]){
                       arr.add(nums[i]);
                    }
                }
            }
            arr1.add(arr.get(0));
            for(int i = 1; i < arr.size();i++){
              if(arr.get(i) != arr.get(i-1)){
                  arr1.add(arr.get(i));
              }
           }
       int[] res = new int[arr1.size()];
            int k = 0;
            for(int x : arr1){
                res[k++] = x;
            }
       return res;
   }

}
