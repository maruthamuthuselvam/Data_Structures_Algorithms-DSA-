import java.sql.SQLSyntaxErrorException;

public class Third_Maximum_Number {
    public static void main(String[] args) {
        int[] nums = {1,1,2,-2};
        System.out.println(MaxNum(nums));
    }
 /*   static int MaxNum(int[] nums){
        if(nums.length < 3){
            int max = 0;
            if(nums[0] > nums[1]){
                max = nums[0];
            }
            else{
                max = nums[1];
            }
            return max;
        }
        int firstmax = 0;
        for(int i = 0;i < nums.length;i++){
            if(firstmax < nums[i]){
                firstmax = nums[i];
            }
        }
        int secondmax = 0;
        for(int i = 0;i < nums.length;i++){
            if(secondmax < nums[i]){
                if(nums[i] == firstmax){
                    continue;
                }
                else{
                    secondmax = nums[i];
                }
            }
        }
        int thirdmax = 0;
        for(int i = 0;i < nums.length;i++){
            if(thirdmax < nums[i]){
                if(nums[i] == secondmax || nums[i] == firstmax){
                    continue;
                }
                else{
                    thirdmax = nums[i];
                }
            }
        }
        if(thirdmax == 0){
            return firstmax;
        }
        return thirdmax;
        }
 */
 static int MaxNum(int[] nums) {
     long first = Long.MIN_VALUE;
     long second = Long.MIN_VALUE;
     long third = Long.MIN_VALUE;

     for(int n : nums) {
         if(n == first || n == second || n == third) continue;

         if(n > first) {
             third = second;
             second = first;
             first = n;
         } else if(n > second) {
             third = second;
             second = n;
         } else if(n > third) {
             third = n;
         }
     }

     return third == Long.MIN_VALUE ? (int)first : (int)third;
 }

}
