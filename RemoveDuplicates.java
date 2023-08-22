import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        removeDuplicates(arr);
    }

    public static int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> ht = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++) {
            ht.add(nums[i]);
        }
        Iterator<Integer> it = ht.iterator();
        int i=0;
        while(it.hasNext()) {
            nums[i++] = it.next();
        }
        for(int k=0;k<i;k++) {
            System.out.print(nums[k] + " ");
        }
        return i;
    }
}
