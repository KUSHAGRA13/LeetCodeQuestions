package Backtracking;
import java.util.*;

public class Input {

    static int n;
    static int[] arr ;

    public Input() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
    }

}
