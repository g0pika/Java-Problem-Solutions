import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[9][9];

        System.out.println("Enter the elements of the 9x9 sudoku board, separated by spaces:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        SudokuValidator sudokuValidator = new SudokuValidator(board);
        boolean isValid = sudokuValidator.isValidSudoku();

        if (isValid) {
            System.out.println("The given sudoku board is valid.");
        } else {
            System.out.println("The given sudoku board is not valid.");
        }

    }
    }
