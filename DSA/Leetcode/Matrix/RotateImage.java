// Leetcode 48 Rotate Image

package DSA.Leetcode.Matrix;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the Matrix
        for(int i=0; i<n ;i++){
            for(int j=i; j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                }
            }

        // Reverse the Rows
        for (int i=0;i<n; i++){
            for (int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}
