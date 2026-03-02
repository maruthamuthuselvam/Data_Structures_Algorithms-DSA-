public class Program_for_length_of_a_string_using_recursion {
    public static void main(String[] args) {
        String name = "dfh";
        int i = 1;
        Find_Length(name , i);
    }

   static void Find_Length(String name, int i) {
       if(i == name.length()){
           System.out.println(i);
           return;
       }
        Find_Length(name, i + 1);
    }

}
