package AdHoc;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(new ZigZag().convert(str, 4));
    }

    public String convert(String str, int noOfRows) {
        int totalColumns = getTotalColumns(str, noOfRows);
        if(noOfRows==1)
            return str;
        if(noOfRows==2) {
            String ans = "";
            for(int i=0;i<str.length();i=i+2) {
                ans = ans + str.charAt(i);
            }
            for(int i=1;i<str.length();i=i+2) {
                ans = ans + str.charAt(i);
            }
            return ans;
        }
        char[][] matrix =  new char[noOfRows][totalColumns];
        int column =0, row =0, index=0;
        while(index<str.length()) {
            if(column%(noOfRows-1)==0) {
                if(row == noOfRows) {
                    column ++;
                    row--;
                } else {
                    matrix[row++][column] = str.charAt(index++);
                }
            }
            else {
                matrix[--row][column] = str.charAt(index++);
                column ++;
                if(column%(noOfRows-1)==0)
                    row =0;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<noOfRows;i++) {
            for (int j=0;j<totalColumns;j++) {
                if (matrix[i][j] != '\u0000') {
                    ans.append(matrix[i][j]);
                }
            }
        }
        return ans.toString();

    }

    private int getTotalColumns(String str, int noOfRows) {
        int index =0, numberOfColumns = 0;
        while(index<str.length()) {
            if(index%(noOfRows-1)==0) {
                numberOfColumns++;
                index = index+noOfRows;
            }
            else {
                numberOfColumns++;
                index = index+1;
            }
        }
        return numberOfColumns;
    }
}
