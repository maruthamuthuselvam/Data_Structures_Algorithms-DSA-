import java.util.ArrayList;

public class String_Permutation {
    public static void main(String[] args) {
        System.out.println(permutationsRet("","abc"));
        //permutations("","abc");
    }

    private static void permutations(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length();++i){
            String f = p.substring(0, i);
            String e = p.substring(i);
            permutations(f + ch + e , up.substring(1));
        }
    }
    private static ArrayList<String> permutationsRet(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i <= p.length();++i){
            String f = p.substring(0, i);
            String e = p.substring(i);
            ArrayList<String> ans = permutationsRet(f + ch + e , up.substring(1));
            arr.addAll(ans);
        }

        return arr;
    }
}
