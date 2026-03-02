public class Maximum_Product_of_Two_Elements_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(FindNum(nums));
    }
    static int FindNum(int[] nums){
        int first = 0;
        int second = 0;
        for(int n : nums){
            if(n > first){
                second = first;
                first = n;
            }
            else if(n > second){
                second = n;
            }
        }
       return (first-1)*(second-1);
    }
}
