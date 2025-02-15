package Leetcode.HashMap;

public class EqualRowAndColumn {
    public int equalRowandColumn(int[][] grid){
        int n = grid.length;
        int[][] transposeMatris = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                transposeMatris[i][j] = grid[j][i];
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == transposeMatris[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    
}
