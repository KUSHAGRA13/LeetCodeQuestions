package BinarySearch;

import java.util.Scanner;

/**
 * Q74
 */
public class Search2DMatrix {

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
        int target = sc.nextInt();
        System.out.println(new Search2DMatrix().searchMatrix(matrix, target));

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int c  = matrix[0].length;
        int foundRow =0;
        for(int i=0;i<matrix.length;i++) {
            if(target>=matrix[i][0] && target<=matrix[i][c-1]) {
                foundRow =i;
                break;
            }
        }

        boolean found = false;
        int begin=0, end = c-1,mid;
        while(begin<=end) {
            mid = (begin+end)/2;
            if(matrix[foundRow][mid] == target) {
                found = true;
                break;
            }
            else if (target>matrix[foundRow][mid])
                begin = mid+1;
            else
                end = mid-1;
        }
        return found;
    }
}
