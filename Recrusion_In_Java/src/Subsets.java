import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(findSubsets(nums));
    }
  static List<List<Integer>> findSubsets(int[] nums){
    List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num : nums){
        int len = outer.size();
        for(int i = 0; i < len;i++){
            List<Integer> internal = new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
        }
    }
        return outer;
}
}
