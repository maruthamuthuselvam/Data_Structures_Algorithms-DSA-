public class House_Robber {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,1};
       // int[] arr = {2,7,9,3,1};
        int[] arr = {8,9,9,4,10,5,6,9,7,9};
        int sum = 0;
        int sum1 = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            sum = 0;
            sum1 = 0;
            for(int j = 0;j < arr.length;j++) {
                if (i + 1 == j || i-1 == j) {
                    continue;
                }
                if (j % 2 == 0) {
                    sum += arr[j];
                } else {
                    sum1 += arr[j];
                }
            }
            if(i%2 == 0) {
                sum1 += arr[i];
            }
            else{
                sum += arr[i];
            }
            if(sum < sum1 && max < sum1){
                max = sum1;
            }
            else if(sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
