package DynamicProgramming;

/**
 * Q53
 */
public class MaximumSubArray {

    public static void main(String[] args) {

        System.out.println(new MaximumSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }

    public int maxSubArray(int[] arr) {

        int maxSoFar = arr[0], max =arr[0];
        for(int i=1;i< arr.length;i++) {
            if(arr[i]>maxSoFar) {
                maxSoFar =arr[i];
            } else {
                maxSoFar += arr[i];
            }
            if(max<maxSoFar)
                max = maxSoFar;
        }
        return max;

    }



}
