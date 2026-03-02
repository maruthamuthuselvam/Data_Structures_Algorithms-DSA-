import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,3,4};
        int m = 3;
        int n = 3;
        MergeArray(nums1,nums2,m,n);
    }
    static void MergeArray(int[] nums1,int[] nums2,int m,int n){
        if(n == 0){
            System.out.println(Arrays.toString(nums1));
        }
        else{
            for(int i = 0;i < n;i++){
                nums1[m+i] = nums2[i];
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

}
