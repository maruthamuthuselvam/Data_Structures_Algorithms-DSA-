import java.util.Arrays;

public class Set_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
        //int[][] mat = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
       /* for(int i = 0;i < mat.length;i++){
            for(int j = 0;j < mat[0].length; j++ ){
                if(mat[i][j]==0){
                    rowchange(mat,i);
                    colchange(mat,j);
                }
            }
            if(i==mat.length-1){
                numchange(mat);
            }
        }


        System.out.println(Arrays.deepToString(mat));
    }
    static void numchange(int[][] mat) {
        for (int k = 0; k < mat.length; k++) {
            for (int l = 0; l < mat[0].length; l++) {
                if (mat[k][l] == -1) {
                    mat[k][l] = 0;
                }
            }
        }
    }
    static void rowchange(int[][] mat,int row){
        for(int j = 0;j < mat[row].length;j++){
            if(mat[row][j]==0 ){
                continue;
            }
                mat[row][j] = -1;
        }
    }
    static void colchange(int[][] mat, int col){
        for(int i = 0;i < mat.length;i++){
            if( mat[i][col]==0){
                continue;
            }
                mat[i][col] = -1;
        }

    }*/
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    mat[i][j] = 0;
                }
            }

        }
        System.out.println(Arrays.deepToString(mat));
    }
}
