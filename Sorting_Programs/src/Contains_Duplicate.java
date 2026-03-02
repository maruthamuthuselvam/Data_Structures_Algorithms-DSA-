public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {15,3,4,5};
        System.out.println(ContainsDuplicate(nums));
    }

    static boolean ContainsDuplicate(int[] nums){
        if(nums.length == 1){
            return true;
        }
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0;j < nums.length;j++){
            if(j != nums.length-1 && nums[j] >= nums[j+1]){
                return true;
            }
        }
        return false;
    }
}
