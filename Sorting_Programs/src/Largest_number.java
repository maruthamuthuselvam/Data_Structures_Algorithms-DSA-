import java.util.Arrays;
import java.util.*;
public class Largest_number {
    public static void main(String[] args) {
        int[] nums = {3,9,30,34,5,55,23,56,7};
        int[] ans = new int[nums.length];
        int count = 0;
        for (int num : nums) {
            if (num < 10) {
                ans[count] = num;
                count++;
            }
        }
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        for(int i : nums){
            if(i >= 10){
             ArrayList<Integer> arr = checkForsum(i);
             for(int j = 0;j < ans.length;++j){
                 if(ans[j] == 0) continue;
                 for(int iter = 1; iter < arr.size();iter++){
                     if(arr.get(iter) <= ans[j]){
                         if(arr.get(iter) < ans[j]){
                             break;
                         }
                         ans[j - 1] = arr.get(0);
                     }
                     else{
                         ans[j - 1] = ans[j];
                         ans[j] = arr.get(0);
                     }
                 }

             }
            }
        }
        System.out.println(Arrays.toString(ans));
        //System.out.println(Math.ceil((float)/2));
    }

    private static ArrayList<Integer> checkForsum(int i) {
        ArrayList<Integer> arr = new ArrayList<>();
        int ans = i;
        while(i > 0){
           arr.add(0,i % 10);
            i /= 10;
        }
        arr.add(0, ans);
        System.out.println(arr);
        return arr;
    }
}

