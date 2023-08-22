package DynamicProgramming;

import java.util.Scanner;

public class IncreasingPath {

     int[] dirX = {0, 0, 1, -1};
     int[] dirY = {1, -1, 0, 0};

     int mod = 1000000007;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] grid = new int [m][n];
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int [m][n];
        IncreasingPath ip = new IncreasingPath();
        System.out.println(ip.countPaths(dp, grid, m, n));
    }

    public  boolean isValidGrid(int nx, int ny, int[][] grid) {
        return (nx >= 0) && (nx < grid.length) && (ny >= 0) && (ny < grid[0].length);
    }

    public  int countPaths(int[][] dp, int [][] grid, int m, int n) {
       int ans = 0;
        for (int i=0;i<grid.length;i++) {
           for (int j=0;j<grid[0].length;j++) {
               ans = (ans%mod + dfs(dp, grid, i,j)%mod)%mod;
           }
       }
        return ans%mod;
    }

    public int dfs(int[][] dp, int[][] grid, int x, int y) {

        if (dp[x][y]!=0)
            return dp[x][y];
        int ans =1;
        for(int i=0;i<4;i++) {
            int nx = x+dirX[i], ny = y+dirY[i];
            if(isValidGrid(nx, ny, grid) &&  grid[x][y]<grid[nx][ny]) {
                ans = (ans + dfs(dp, grid, nx, ny))%mod;
            }
        }
        dp[x][y] = ans%mod;
        return ans%mod;
    }
}
