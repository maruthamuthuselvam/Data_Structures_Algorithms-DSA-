public class Negative_Num_In_Sorted_matrix {
    public static void main(String[] args) {
        int[][] mat = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(Findcount(mat));
    }
    static int Findcount(int[][] mat){
        int count = 0;
        for(int i = 0; i < mat.length;i++){
            for(int j = 0; j < mat[0].length;j++){
                if(mat[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}
