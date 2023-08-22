package Greedy;

import java.util.Scanner;

/**
 * Q45
 */
public class JumpGame2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(new JumpGame2().jump(arr));

    }

    public int jump(int[] arr) {
        int noOfJumps =0,maxIndex=0;

        for(int i=0;i<arr.length;) {
            if(i+arr[i]>=arr.length-1){
                noOfJumps++;
                break;
            }
            else {
                int weightedIndex =0,j,max=0;
                for (j=i+arr[i];j>i;j--) {
                    int tempMax = arr[j] - weightedIndex;
                    weightedIndex++;
                    if(max<tempMax) {
                        max = tempMax;
                        maxIndex=j;
                    }
                }
            }

            noOfJumps++;
            i=maxIndex;

        }

        return noOfJumps;
    }
}
