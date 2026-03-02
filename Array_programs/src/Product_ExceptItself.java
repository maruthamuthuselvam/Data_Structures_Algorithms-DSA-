import java.util.Arrays;

public class Product_ExceptItself {
    public static void main(String[] args) {
        int[] nums = {6,2,3,8};
        int productL = 1;
        int productR = 1;
        int[] ans = new int[nums.length];
        for(int i = nums.length - 1;i >= 0; i--){
            ans[i]=productR;
            productR *= nums[i];
        }
        for(int j = 0;j < nums.length;j++){
            ans[j] *= productL;
            productL *= nums[j];
        }
        System.out.println(Arrays.toString(ans));
    }
}
