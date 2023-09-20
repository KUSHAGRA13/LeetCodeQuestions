package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Q62
 */
public class MinimumPathSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] grid = new int[r][c];

        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(new MinimumPathSum().minPathSum(grid));

    }

    public int minPathSum(int[][] grid) {
        List<Integer> lst = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        System.out.println(findMinimum(0,0,grid));
        //System.out.println(lst);
        return min;
    }

    private int findMinimum(int currentRow, int currentColumn, int[][] grid) {

        if (currentRow>= grid.length || currentColumn>=grid[0].length)
            return 0;
        return grid[currentRow][currentColumn] + findMinimum(currentRow+1,currentColumn,grid) +
        findMinimum(currentRow, currentColumn+1, grid);
    }
}
