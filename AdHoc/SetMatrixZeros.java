package AdHoc;

import java.util.*;

/**
 * Q73
 */
public class SetMatrixZeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        new SetMatrixZeros().setZeroes(matrix);

    }

    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        List<Integer> rowIndex = new ArrayList<>();
        List<Integer> columnIndex = new ArrayList<>();

        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                if(matrix[i][j] ==0) {
                    rowIndex.add(i);
                    columnIndex.add(j);
                }
            }
        }

        for (Integer index : rowIndex) {
            for (int j = 0; j < c; j++) {
                matrix[index][j] = 0;
            }
        }

        for (Integer index : columnIndex) {
            for (int j=0;j<r;j++) {
                matrix[j][index] =0;
            }
        }
    }
}
