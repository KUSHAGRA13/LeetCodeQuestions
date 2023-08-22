package DynamicProgramming;

import java.util.*;
/**
 * Q62
 */
public class UniquePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(new UniquePaths().uniquePaths(m,n));

    }

    public int uniquePaths(int r, int c) {

        int[][] matrix = new int[r][c];

        if(r==1)
            return 1;
        if(c==1)
            return 1;
        else {
            matrix[0][0] = 0;
            for(int i=1;i<c;i++)
                matrix[0][i] = 1;
            for(int i=1;i<r;i++)
                matrix[i][0] = 1;

            for (int i=1;i<r;i++) {
                for (int j=1;j<c;j++) {
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
                }
            }
        }
        return matrix[r-1][c-1];
    }
}
