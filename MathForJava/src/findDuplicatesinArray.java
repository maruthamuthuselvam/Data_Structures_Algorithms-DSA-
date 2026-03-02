public class findDuplicatesinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,4,4,4,5,6,5,4,6,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr){
        int unique = 0;
        for(int a : arr){
            unique ^= a;
        }
        return unique;
    }
}
