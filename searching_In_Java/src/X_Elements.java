public class X_Elements {
    public static void main(String[] args) {
        int[] arr = {0,4,3,4,0};
       System.out.println(findnum(arr));
    }
    static int findnum(int[] arr){
        int count = 0;
        int low = 1000000;
        for(int i = 0; i < arr.length; i++){
            if(arr.length <= arr[i]){
                count++;
            }
        }
        if(count == arr.length){
            return count;
        }
        count = 0;
        for(int i = 0;i < arr.length;i++){
            if(low > arr[i] && arr[i]!=0){
                int temp = low;
                low = arr[i];
                arr[i] = temp;
            }
        }
        for(int i = 0;i < arr.length;i++){
            if(low <= arr[i]){
                count++;
            }
        }
        if(count == low){
            return low;
        }
        return -1;
    }
}
