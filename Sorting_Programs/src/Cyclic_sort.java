import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int i = 0;
        int temp = 0;
        System.out.println(findsize(arr, temp, i)+1);
    }
        static int findsize(int[] arr,int temp,int i){
            while (i < arr.length) {
                int correct = arr[i]-1;
                if(arr[0] == 0) {
                    correct = arr[i];
                }
                if (arr[i] != arr[correct]) {
                    temp = arr[correct];
                    arr[correct] = arr[i];
                    arr[i] = temp;
                } else {
                    i++;
                }
            }
            System.out.println(Arrays.toString(arr));
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j < arr.length - 1 && arr[j] > arr[j + 1]) {
                    arr[j] = count;
                    return count;
                }
                else{
                    count++;
                }
            }
            return 0;
    }
}
