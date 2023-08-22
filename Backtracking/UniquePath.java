package Backtracking;

import java.util.*;

/**
 * Q62
 */
public class UniquePath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(new UniquePath().uniquePaths(m, n));
    }

    public int uniquePaths(int m, int n) {

        return calculateUniquePath(0,0,m,n);

    }

    private int calculateUniquePath(int rightMove, int downMove, int r, int c) {
        if(downMove==r-1 && rightMove==c-1)
            return 1;
        else if (downMove>=r || rightMove>=c)
            return 0;
        return calculateUniquePath(rightMove+1,downMove,r,c) + calculateUniquePath(rightMove,downMove+1,r,c);
    }
}
