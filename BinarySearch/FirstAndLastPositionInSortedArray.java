package BinarySearch;

import java.util.Scanner;

/**
 * LeetCode Q34
 */
class FirstAndLastPositionInSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] res = new FirstAndLastPositionInSortedArray().searchRange(arr, target);
        System.out.println(res[0]);
        System.out.println(res[1]);

    }

    public  int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findElementInLeftIndex(nums, target, 0, nums.length-1);
        result[1] = findElementInRightIndex(nums, target, 0, nums.length-1);
        return result;
    }

    private int findElementInLeftIndex(int[] arr, int ele, int begin, int end) {

        int mid;
        while(begin<=end) {
            mid = (begin+end)/2;
            if(arr[mid]>ele)
                end = mid-1;
            else if(arr[mid]<ele)
                begin = mid+1;
        }
        return begin;
    }

    private int findElementInRightIndex(int[] arr, int ele, int begin, int end) {

        int mid;
        while(begin<=end) {
            mid = (begin+end)/2;
            if(arr[end] == ele)
                return end;
            if(arr[mid] == ele) {
                int rightIndex =  findElementInRightIndex(arr, ele, mid+1, end);
                return rightIndex ==-1 ? mid:rightIndex;
            }
            if(arr[mid]>ele)
                end = mid-1;
            else if(arr[mid]<ele)
                begin = mid+1;
        }
        return -1;
    }
}
