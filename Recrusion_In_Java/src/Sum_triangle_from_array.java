import java.util.ArrayList;
import java.util.Arrays;

public class Sum_triangle_from_array {
    public static void main(String[] args) {
       int[] nums = {1, 2, 3, 4, 5};
       int[] res = new int[nums.length - 1];
       int start = 0;
       int end = nums.length - 1;
       int point = 1;
       Sum_of_triangle(nums, res, start, end,point);
    }
    static void Sum_of_triangle(int[] nums, int[] res, int start,int end, int point){
        if(end == 0){
            return;
        }
        if(end < point){
            for(int i = 0; i < end; i++) {
                System.out.print(res[i]+" ");
            }
            Sum_of_triangle(res, res, 0, end - 1, 1);
        }
        else{
            res[start] = nums[start] + nums[point];
            Sum_of_triangle(nums, res, start + 1, end, point + 1);
        }
    }
}
