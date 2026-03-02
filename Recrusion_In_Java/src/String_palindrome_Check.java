public class String_palindrome_Check {
    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(checkPalin(str, 0, str.length() - 1));
    }

    private static boolean checkPalin(String str, int start, int end) {
        if(start > end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return checkPalin(str, start+1, end-1);
    }
}
