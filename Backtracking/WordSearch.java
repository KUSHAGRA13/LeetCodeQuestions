package Backtracking;

import java.util.Scanner;

/**
 * Q79
 */
public class WordSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        char[][] board = new char[row][column];

        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }

        String word = sc.next();
        System.out.println(new WordSearch().exist(board, word));
    }

    public boolean exist(char[][] board, String word) {
        return wordExist(board,word,0,0,"");
    }

    private boolean wordExist(char[][] board, String word, int rowIndex, int columnIndex, String newWord) {
        if ((rowIndex<0 || rowIndex>=board.length) || (columnIndex<0 || columnIndex>=board[0].length)) {
        }
        else {
            if(newWord.equals(word))
                return true;
            newWord = newWord + board[rowIndex][columnIndex];
            return wordExist(board, word, rowIndex + 1, columnIndex, newWord)
                    || wordExist(board, word, rowIndex, columnIndex + 1, newWord);
            /* wordExist(board, word, rowIndex-1, columnIndex,newWord);
            if(newWord.length()>0)
                newWord = newWord.substring(0,newWord.length()-1);

             */
        }
        return false;

    }
}
