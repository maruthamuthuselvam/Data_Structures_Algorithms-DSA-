import java.util.ArrayList;

public class Count_of_Smaller_Numbers_After_Self {
    public static void main(String[] args) {
        int[] nums = {-1};
        System.out.println(FindNum(nums));
    }
    static ArrayList<Integer> FindNum(int[] nums){
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
             count = 0;
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
           arr.add(count);
        }
        return arr;
    }
}
