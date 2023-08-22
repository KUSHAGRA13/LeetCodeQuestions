package BinarySearch;

import java.util.*;

/**
 * Leetcode Q33
 */
public class SearchInRotatedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int ele) {
        int begin = 0, end = arr.length - 1, mid = (begin + end) / 2;
        while (begin <= end) {
            mid = (begin + end) / 2;
            if (arr[mid] == ele)
                return mid;
            if (arr[begin] < arr[mid]) {
                // first part of the array is sorted
                if(ele == arr[begin]) {
                    return begin;
                }
                if (ele >= arr[begin] && ele < arr[mid]) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
            } else {
                // first part of the array is not sorted
                // second part of the array is sorted
                if(ele == arr[end]) {
                    return end;
                }
                if (ele <= arr[end] && ele > arr[mid]) {
                    begin = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
