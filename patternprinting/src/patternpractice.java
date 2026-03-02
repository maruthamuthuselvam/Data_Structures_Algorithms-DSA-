public class patternpractice {
    public static void main(String[] args) {
        int times = 4;
        int num = 1;
        patternprint(times,num);
    }
    static void patternprint(int times , int num){
            for(int i = 1; i <= times * 2 - 1; i++){
                int rowChange = i <= times ? i : (times * 2) - i;
                //int numChange = i <= times ? num : (num / 2 );
                int temp = num;
                int count = num / 2;
                for (int j = 1; j <= rowChange; j++){
                    if(i > times) {
                        System.out.print(count++ +" ");
                    }
                    else{
                        System.out.print(temp++ +" ");
                    }
                    num++;
                }

                System.out.println("");
            }


        }

    }

