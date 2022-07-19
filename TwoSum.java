package ArrayQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no = Integer.parseInt(br.readLine());
        int[] arr = new int[no];
        int target = Integer.parseInt(br.readLine());
        int[] result = twoSum(arr,target);
    }

    public static int[] twoSum(int[] arr, int target) {

        int[] result = new int[2];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int newPosition = binarySearch(arr,i+1,arr.length,target-arr[i]);
            if(newPosition!=-1)
            {
                result[0] = i;
                result[1] = newPosition;
            }
        }
        return result;
    }

    private static int binarySearch(int[] arr, int start, int end,int element) {
        int found = -1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(arr[mid] == element)
                found = mid;
            else if(element > arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return found;
    }
}
