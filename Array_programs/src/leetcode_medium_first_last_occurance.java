public class leetcode_medium_first_last_occurance {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,7,7,8};
        int target = 7;
        System.out.println(findnum(arr,target));

    }
    static int findnum(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid]==target ){

            }
        }
        return 0;
    }
}
