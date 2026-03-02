public class prefix_in_String {
    public static void main(String[] args) {
        String[] strs = {"hello","ello","llo"};
        String ans = strs[0];
        String res = "";
        System.out.println(findStr(strs, ans, res));
    }
// this got only a 5.10 beats but still i satisified by my approach. i'm happy to solve this problem by my own;
    private static String findStr(String[] strs, String ans, String res) {

        if (strs.length == 1) {
           return strs[0];
        }
        if (strs[0].length() == 0) {
            return "";
        }
        // for(int k = 0; k < strs.length - 1;k++){
        //    if(strs[k].charAt(0) != strs[k+1].charAt(0)){
        //         return "";
        //    }
        //    }

        for (int i = 1; i < strs.length; i++) {
            res = "";
            for (int j = 0; j < strs[i].length(); j++) {
                if (j < ans.length() && j < strs[i].length() && ans.charAt(j) == strs[i].charAt(j)) {
                    res += strs[i].charAt(j);
                } else if(strs.length > i) {
                    break;
                }
                else{
                    return res;
                }
            }
            ans = res;
        }
        return res;
    }

}
