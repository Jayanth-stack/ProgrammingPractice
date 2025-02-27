// Leetcode 289
package DSA.Leetcode.Matrix;

public class LiveOrDead {
    public void gameOfLife(int[][] board) {
        int[][] copy = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                copy[i][j] = board[i][j];
            }
        }
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        for(int i = 0; i < copy.length; i++){
            for(int j = 0; j < copy[0].length; j++){
                int liveCount = 0;
                for(int[] dir : directions){
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if(x >= 0 && x < copy.length && y >= 0 && y < copy[0].length && copy[x][y] == 1){
                        liveCount++;
                    }
                }
                if(copy[i][j] == 1){
                    if(liveCount < 2 || liveCount > 3){
                        board[i][j] = 0;
                    }
                }else{
                    if(liveCount == 3){
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}
