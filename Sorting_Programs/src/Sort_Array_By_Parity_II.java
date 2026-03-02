import java.util.Arrays;

public class Sort_Array_By_Parity_II {
    public static void main(String[] args) {
        int[] nums = {3,4};
        System.out.println(Arrays.toString(SortArray(nums)));
    }
   static int[] SortArray(int[] nums){
       /* for(int i = 0;i < nums.length;i++){
            if(i % 2 == 0 || nums[i] % 2 == 0){
                for(int j=i+1; j < nums.length;j++){
                    if(nums[j] %2 != 0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }*/
       int set = 0;
       int set1 = 0;
       int[] pos = new int[nums.length/2];
       int[] neg = new int[nums.length/2];
       for(int i = 0;i < nums.length;i++){
           if(nums[i] % 2 == 0){
               pos[set++] = nums[i];
           }
           else{
               neg[set1++] = nums[i];
           }
       }
       set = 0;
       set1 = 0;
       for(int i = 0;i < nums.length;i++){
           if(i % 2 == 0){
               nums[i] = pos[set++];
           }
           else{
               nums[i] = neg[set1++];
           }
       }
        return nums;
   }
}
