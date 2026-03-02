public class Sum_of_triangle_Leetcode {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
            int i = 0;
            int j = nums.length - 1;
        System.out.println(Findres(nums, i,j));

        }
        static int Findres(int[] nums, int i, int j){
            if(j == 0){
                return nums[j];
            }
            if(i !=  j){
                if(nums[i] + nums[i+1] > 9){
                    int num = nums[i] + nums[i + 1];
                    nums[i] = num % 10;
                }
                else{
                    nums[i] = nums[i] + nums[i + 1];
                }
            }
            else{
               return Findres(nums, 0, j - 1);
            }
            return Findres(nums, i + 1, j);

        }
    }

