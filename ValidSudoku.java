import java.util.Scanner;

public class ValidSudoku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] sudokuBoard = new char[9][9];
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                sudokuBoard[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println(isValidSudoku(sudokuBoard));

    }

    public static boolean isValidSudoku(char[][] board) {
        if (isValidRow(board)) {
            if (isValidColumn(board)) {
                if(isValidBlock(board)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isValidBlock(char[][] board) {
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                int[] hash = new int[10];
                for (int k=0;k<3;k++) {
                    for (int l=0;l<3;l++) {
                        if (board[k+3*i][l+3*j] !='.') {
                            if (hash[board[k+3*i][l+3*j]-48] !=0) {
                                return false;
                            }
                            else
                                hash[board[k+3*i][l+3*j]-48] ++;
                        }
                    }
                }
            }
        }

        return true;
    }

    private static boolean isValidColumn(char[][] board) {
        for(int i=0;i<9;i++) {
            int[] hash = new int[10];
            for (int j=0;j<9;j++) {
                if (board[j][i] != '.') {
                    if (hash[board[j][i] - 48] != 0) {
                        return false;
                    }
                    hash[board[j][i] - 48] ++;
                }
            }
        }
        return true;
    }

    private static boolean isValidRow(char[][] board) {

        for(int i=0;i<9;i++) {
            int[] hash = new int[10];
            for (int j=0;j<9;j++) {
                if (board[i][j] != '.') {
                    if (hash[board[i][j] - 48] != 0) {
                        return false;
                    }
                    hash[board[i][j] - 48] ++;
                }
            }
        }
        return true;
    }
}
