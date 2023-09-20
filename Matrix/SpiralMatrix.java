package Matrix;

import java.util.*;

/**
 * Q54
 */
public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        for (int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        new SpiralMatrix().spiralOrder(matrix);



    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int direction =0;
        int rPivot =0, bPivot = c-1, lPivot = r-1 , tPivot = 0;
        int row =0, column =c;
        for (int i=0;i<r-row;i++) {

            // Left to right
            if (direction%4==0) {
                for (int j=0;j<c;j++)
                    System.out.print(matrix[i][j] + " ");

                row++;

            }
            // Top to bottom
            else  if (direction%4==1) {
                for (int j=row;j<r;j++)
                    System.out.print(matrix[i][j]);
                column++;
            }

            //Right to Left
            if (direction%4==2) {

            }
            if (direction%4==3) {
                tPivot++;
            }
            direction++;
        }


        return null;
    }
}
