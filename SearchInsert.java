import java.util.Scanner;

public class SearchInsert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums ,target);
    }

    public static int binarySearch(int[] arr, int number) {
        int begin =0, end = arr.length-1 , mid =0;
        while (begin<end) {
            mid = (begin + end)/2;
            if (arr[mid] == number) {
                break;
            }
            else if (number > arr[mid])
                begin = mid+1;
            else
                end = mid-1;
        }
        if(begin == end) {
            if (number > arr[begin]) {
                return begin +1;
            }
            else return begin;
        }
        return mid;
    }


}
