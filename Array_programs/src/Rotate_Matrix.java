import java.util.Arrays;

public class Rotate_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0},{0, 0, 0} };
        System.out.println(matrix( target, mat));
    }
       /* static boolean matrix(int[][] arr,int[][] target,int[][] mat){
        int count = 0;
        while(count < 4){
            int col = 0;
            int row = mat.length-1;
            for(int i = 0;i < mat.length;i++){
                for(int j = 0; j < mat.length;j++){
                    if(count == 0){
                        arr[j][col] = mat[row][j];
                    }
                    else{
                        mat[j][col] = arr[row][j];
                    }
                }
                row--;
                col++;
            }
            if(checkmat(arr,target,mat,count)){
                return true;
            }
            else{
                count++;
            }
        }
        return false;
    }
    static boolean checkmat(int[][] arr,int[][] target,int[][] mat,int count){
        for(int i = 0;i < target.length;i++){
            for(int j = 0; j < target.length;j++) {
                if (count > 0) {
                    if (mat[i][j] != target[i][j]) {
                        return false;
                    }
                } else {
                    if (arr[i][j] != target[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    }*/
    static boolean matrix( int[][] target, int[][] mat){
        for(int k = 0;k < 4;k++){
            if(equalmat(target , mat)){
                return true;
            }
            mat = obtainmat(mat);
        }

        return false;
    }
    static boolean equalmat(int[][] target,int[][] arr){

        for(int i = 0;i < target.length;i++){
            for(int j = 0; j < target[0].length; j++){
                if(target[i][j]!=arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    static int[][] obtainmat(int[][] mat){

    int n = mat.length;
        int row = n-1;
        int col = 0;
        int[][] res = new int[n][n];
        for(int i = 0;i < mat.length;i++){
            for(int j = 0; j < mat[0].length; j++){
                    res[j][col] = mat[row][j];
                }
            row--;
            col++;
            }
        return res;
        }

}


