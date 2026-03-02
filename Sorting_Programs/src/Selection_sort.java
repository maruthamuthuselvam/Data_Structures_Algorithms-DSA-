import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] nums = {2,3,1,7,5,4,6};
        //System.out.println(Arrays.toString(Sort_Array(nums)));
    }

    static int Get_Max(int[] nums,int start,int end){
        int max = 0;
        for(int i = start; i < end;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
}
