//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int product = 1;
        int[] nums = {1,2,3,4};
        for(int i = 0;i < nums.length;i++){

            for(int j = 0;j < nums.length;j++){
                if(i==j){
                    continue;
                }
                product*=nums[j];
            }
            nums[i]=product;
            product = 1;
        }

    }
}