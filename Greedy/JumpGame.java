package Greedy;

import java.util.Scanner;

/**
 * Q55
 * This involves the concept of weighted index
 */
public class JumpGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(new JumpGame().canJump(arr));

    }

    public boolean canJump(int[] arr) {
        boolean result = true;
        int maxIndex=0;

        for(int i=0;i<arr.length;) {
            if (i + arr[i] >= arr.length - 1) {
                break;
            }
            else if (arr[i]==0) {
                result = false;
                break;

            }
            else {
                int weightedIndex = 0, j, max = Integer.MIN_VALUE;
                for (j = i + arr[i]; j > i; j--) {
                    int tempMax = arr[j] - weightedIndex;
                    weightedIndex++;
                    if (max < tempMax) {
                        max = tempMax;
                        maxIndex = j;
                    }
                }
            }
            i = maxIndex;
        }
        return result;
    }
}
