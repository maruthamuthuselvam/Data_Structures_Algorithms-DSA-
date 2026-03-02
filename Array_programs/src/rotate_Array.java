import java.util.Arrays;

public class rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int count = 0;
        int last = 0;
        while( count < k ){
             last = arr[arr.length - 1];
             for(int i = arr.length-2; i >= 0;i--){
                 arr[i+1] = arr[i];
             }
             arr[0]=last;
             count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
