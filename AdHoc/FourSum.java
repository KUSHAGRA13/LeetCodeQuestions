package AdHoc;

import java.util.*;

/**
 * Q18
 */
public class FourSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();
        System.out.println(new FourSum().fourSum(arr,target));
    }

    public List<List<Integer>> fourSum(int[] arr, long target) {

        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j< arr.length;j++) {
                for (int k=j+1;k< arr.length;k++) {
                    long searchItem = target-arr[i]-arr[j]-arr[k];
                    int found = binarySearch(arr, k+1, arr.length-1, searchItem);
                    if(found>-1) {
                        if(isValidQuadraple(result, Arrays.asList(arr[i], arr[j], arr[k], arr[found])))
                            result.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k], arr[found])));
                    }
                }
            }
        }
        return result;
    }

    private boolean isValidQuadraple(List<List<Integer>> result, List<Integer> asList) {

        for(int i=0;i< result.size();i++) {
            if(asList.equals(result.get(i))) {
                return false;
            }
        }
        return true;
    }
    private int binarySearch(int[] arr, int start, int end, long item) {

        int mid = 0;
        while(start<=end) {
            mid = (start+end)/2;
            if(arr[mid] == item) {
                return mid;
            }
            else if (item>arr[mid]) {
                start = mid+1;
            }
            else
                end = mid-1;
        }
        return -1;
    }
}
