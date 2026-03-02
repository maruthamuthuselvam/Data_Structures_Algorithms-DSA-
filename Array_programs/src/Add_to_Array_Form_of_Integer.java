import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int[] nums = {2,7,4};
        int k = 181;
        System.out.println(addToArrayForm(nums,k));
    }
        public static List<Integer> addToArrayForm(int[] num, int k) {
            LinkedList<Integer> result = new LinkedList<>();
            int i = num.length - 1;

            // loop while digits remain in num OR k still has digits
            while (i >= 0 || k > 0) {
                if (i >= 0) {
                    k += num[i];    // add digit from array
                    i--;
                }

                result.addFirst(k % 10);  // extract last digit
                k /= 10;                  // reduce k (remove last digit)
            }

            return result;
        }

}
