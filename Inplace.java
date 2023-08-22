import java.util.*;

public class Inplace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(removeElement(arr, val));
        for (int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
    }

    public static int removeElement(int[] nums, int val) {
        int k=0;
        for (int i=0;i< nums.length;) {
            if(nums[i] == val) {
                for (int j=i+1;j<nums.length-k;j++) {
                    nums[j-1] = nums[j];
                }
                k++;
                nums[nums.length-k] = val+1;
            }
            else i++;
        }
    return nums.length -k;
    }
}
