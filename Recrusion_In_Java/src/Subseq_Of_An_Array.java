import java.util.ArrayList;

public class Subseq_Of_An_Array {
    public static void main(String[] args) {
        System.out.println(subSeqRet("","abc"));
    }
    static void subSeq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        subSeq(p + c, up.substring(1));
        subSeq(p, up.substring(1));
    }
    static ArrayList<String> subSeqRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        ArrayList<String> left = subSeqRet(p + c, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }


}
