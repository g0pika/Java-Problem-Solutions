public class SudokuValidator {
    int [][] board;
public SudokuValidator(int[][] board){
    this.board = board;
}
public boolean isValidSudoku(){
    for(int i = 0; i <9; i++){
        for(int j = 0; j < 9; j++){
            if(!isValid(i,j)){
                return false;
            }
        }
    }
    return true;
}

private boolean isValid(int row, int col){
    for(int i=0;i<9;i++){
        if(i!=col && board[row][i] !=0 &&board[row][i] == board[row][col]){
            return false;
        }
    }
    for(int i=0;i<9;i++){
        if(i!=row && board[i][col] != 0 && board[i][col] == board[row][col]){
            return false;
        }
    }
    int r = (row/3)*3;
    int c = (col/3)*3;
    for(int i = r; i<r+3; i++){
        for(int j = c; j<c+3; j++){
            if(i != row && j != col && board[i][j] !=0 && board[i][j] == board[row][col]){
                return false;
            }
        }
    }
return true;
}

}
