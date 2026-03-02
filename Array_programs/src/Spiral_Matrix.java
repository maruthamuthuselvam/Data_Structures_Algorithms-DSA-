import java.util.Arrays;

import java.util.*;
public class Spiral_Matrix {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.deepToString(spiral(n)));
    }
   /* static int[] spiral(int[][] mat){
        int val = 0;
        int[] arr = new int[mat.length*mat[0].length];
            for(int j=0;j < mat[0].length;j++){
                arr[j]=mat[0][j];
                val = j;
            }
            takecol(mat, arr , val , 1);
           return arr;
    }
    static void takecol(int[][] mat, int[] arr, int val, int i){
        int count = val;
        for(int j = i;j < mat.length; j++){
            arr[++count] = mat[j][val];
        }
        takerow(arr, mat, mat.length-1, val-1,count);
        }
        static void takerow(int[] arr, int[][] mat,int val,int i,int count){
        int valup = 0;
            for(int j = i;j >= 0;j--){
                arr[++count] = mat[val][j];
                valup=j;
            }
            colup(mat,arr,val-1,valup,count);
    }
    static void colup(int[][] mat,int[] arr,int row,int j,int count){
        int val=0;
        for(int i = row;i <= mat.length/2;i++){
            arr[++count] = mat[i][j];
            val = i;
        }
        finalrow(mat,arr,val,1,count);
    }
    static int[] finalrow(int[][] mat, int[] arr, int row,int col,int count){
        for(int i = row;i< mat[0].length-1;i++){
            arr[++count] = mat[col][i];
        }
        return arr;
    }
}*/
static int[][] spiral(int n){
        int count = 1;
        int row = n;
        int col = n;
        int[][] arr = new int[n][n];
        int top = 0;
        int right = col - 1;
        int left = 0;
        int bottom = row - 1;
        while(top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = count++;
            }
            right--;
            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = count++;
                }
                bottom--;
            }
            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = count++;
                }
                left++;
            }
        }
        return arr;
}
}
