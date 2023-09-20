package AdHoc;

import java.util.Arrays;
import java.util.Scanner;

public class SortColors {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            new SortColors().sortColors(arr);
        }

    }


    public void sortColors(int[] arr) {

        int zeroPointer =0, twoPointer = arr.length-1, onePointer = 0;
        for (int i=0;i<=twoPointer;i++) {
            if (arr[i] == 2) {
                int temp = arr[twoPointer];
                arr[twoPointer] =arr[i];
                arr[i] = temp;
                twoPointer--;
            }
             if (arr[i] == 0) {
                int temp = arr[zeroPointer];
                arr[zeroPointer] = arr[i];
                arr[i] = temp;
                zeroPointer++;
                onePointer++;
            }
            else if (arr[i] == 1) {
                int temp = arr[onePointer];
                arr[onePointer] = arr[i];
                arr[i] = temp;
                onePointer++;
            }
        }
        Arrays.stream(arr).forEach(ele -> System.out.print(ele + " "));
    }
}
