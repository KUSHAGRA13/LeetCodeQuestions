package TwoPointer;

import java.util.Scanner;

/**
 * Q11
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(new ContainerWithMostWater().maxArea(arr));
    }
    public int maxArea(int[] height) {
        int firstPointer = 0;
        int lastPointer =height.length-1, maxArea = Integer.MIN_VALUE, tempArea = 0;


        for(int i=0;i<height.length;i++) {
            if(height[firstPointer]<height[lastPointer]) {
                tempArea = (lastPointer-firstPointer)*height[firstPointer];
                firstPointer++;
            } else {
                tempArea = (lastPointer-firstPointer)*height[lastPointer];
                lastPointer--;
            }
            if(maxArea<tempArea)
                maxArea = tempArea;
        }
        return maxArea;
    }
}
