public class Find_Uppercase {
    public static void main(String[] args) {
        String s = "marutha muthu SelvaM";
        int i = 0;
        Find_Uppercase_letter(s, i);
    }

    static void Find_Uppercase_letter(String s, int i) {
        if(Character.isUpperCase(s.charAt(i))){
            System.out.println(s.charAt(i));
            return;
        }
        Find_Uppercase_letter(s, i+1);
    }
}
