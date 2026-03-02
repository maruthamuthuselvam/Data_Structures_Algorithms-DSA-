import java.util.*;
public class Array_first_and_last {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int target = 1;
        int[] res = new int[2];
        res[0] = binarySearch(arr, target, 1);
        res[1] = binarySearch(arr, target, 2);
        System.out.println(Arrays.toString(res));
    }

    static int binarySearch(int[] arr, int target, int occurance) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (occurance == 1) {
                    if ( mid - 1 >= 0 && arr[mid - 1] == target) {
                        end = mid - 1;
                    } else {
                        return mid;
                    }
                }
                else {
                    if ( mid + 1 <= arr.length-1 && arr[mid + 1] == target) {
                        start = mid + 1;
                    }
                    else {
                        return mid;
                    }
                }
            }
            else if (arr[mid] > target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }

        }
        return -1;
    }
}
