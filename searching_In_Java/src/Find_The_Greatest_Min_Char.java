public class Find_The_Greatest_Min_Char {
    public static void main(String[] args) {
        char target = 'g';
        char[] letters = {'c','f','j'};
        System.out.println(findChar(letters, target));
    }
    static char findChar(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(letters[mid] > target){
                if(mid > 0 && letters[mid - 1]!= target && letters[mid - 1] > target) {
                    end = mid - 1;
                }
                else{
                    return letters[mid];
                }
            }
            else if(letters[mid] < target || letters[mid] == target){
                start = mid + 1;
            }
            else{
                return letters[0];
            }
        }
        return letters[0];
    }
}
