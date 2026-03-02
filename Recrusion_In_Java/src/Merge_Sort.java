import java.util.Arrays;

import static java.io.ObjectInputFilter.merge;

public class Merge_Sort{
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,3,2,2};
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static void mergeSortInplace(int[] arr, int s, int e) {
        if(e  - s == 1) return;
        int mid = s + ( e - s) / 2;
        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e);

        mergeInplace(arr, s, mid, e);
    }
    private static void mergeInplace(int[] arr, int start, int mid , int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, start , mix.length);

    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left , right);
    }
    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
    while(i < left.length && j < right.length){
        if(left[i] > right[j]){
            mix[k] = right[j];
            j++;
        }
        else{
            mix[k] = left[i];
            i++;
        }
        k++;
    }
    while(i < left.length){
        mix[k] = left[i];
        i++;
        k++;
    }
    while(j < right.length){
        mix[k] = right[j];
        j++;
        k++;
    }
    return mix;
    }
}