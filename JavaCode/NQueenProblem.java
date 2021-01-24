import java.util.Scanner;

/**
 * Created by anishSachdeva on 10/14/17.
 */
public class NQueenProblem {
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int [4][4];
    }
    static void solveNqueens(int[][] board, int row){
       if(row == board.length){
           printboard(board);
           return;
       }
        for(int i = 0; i < board.length; i++){
            if(canPut(board,row,i)){
                board [row][i] = 1;
                solveNqueens(board, i + 1);
                board[row][i] = 0;
            }
        }
    }

}
