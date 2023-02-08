public class Main {
    public static void main(String[] args) {
        int[][] board = {
                {4, 3, 0, 0, 6, 0, 0, 0, 0},
                {6, 0, 0, 5, 7, 1, 0, 0, 0},
                {0, 9, 7, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 9, 0, 0, 0, 7},
                {3, 0, 0, 6, 0, 2, 0, 0, 5},
                {9, 0, 0, 0, 4, 0, 0, 0, 8},
                {0, 1, 0, 0, 0, 0, 8, 7, 0},
                {0, 0, 0, 9, 5, 7, 0, 0, 6},
                {0, 0, 0, 0, 1, 0, 0, 5, 9}
        };
        SudokuValidator sv = new SudokuValidator(board);
        System.out.println(sv.isValidSudoku());
        }
    }
