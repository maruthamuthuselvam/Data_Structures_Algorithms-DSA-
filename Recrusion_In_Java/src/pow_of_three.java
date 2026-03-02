public class pow_of_three {
    public static void main(String[] args) {
        int num = 81;
        System.out.println(FindNum(num));
    }
    static boolean FindNum(int num){
        if(num == 0){
            return false;
        }
        if(num == 1){
            return true;
        }
        if(num % 3 != 0){
            return false;
        }

        return FindNum(num/3);
    }
    }

