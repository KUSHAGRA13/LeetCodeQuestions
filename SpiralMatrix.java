import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }

    public int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];
        int direction =0, number=0, horizontal=0, vertical=n-1;
        for (int i=0;i<n;i++) {
            for (int j=0;j+horizontal<n;j++) {
                // for right direction
                if (direction%4==0) {
                    spiral[horizontal][j] = number;
                }
                // for down direction
                if (direction%4==1) {
                    spiral[j+horizontal][vertical] = number;
                }
                // for left direction
                if (direction%4==2) {
                    spiral[n-horizontal][vertical-j] = number;
                }
                // for up direction
                if (direction%4==3) {
                    spiral[(n-1)-horizontal][(n-1)-vertical] = number;
                }
            }
            if (direction%4==1) {
                horizontal ++;
            }
            if (direction%4==1) {
                vertical --;
            }
            direction++;
        }
        return spiral;
    }
}
