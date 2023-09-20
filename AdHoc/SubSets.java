package AdHoc;

import java.util.*;

/**
 * Q77
 * Solved this problem using binary Representation of a given number
 */
public class SubSets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        new SubSets().subsets(arr);

    }

    public List<List<Integer>> subsets(int[] nums) {

        int numberOfSubsets = (int)Math.pow(2,nums.length);
        List<List<Integer>> lst = new ArrayList<>();

        for(int i=0;i<numberOfSubsets;i++) {
            String binaryRepresentation = getBinaryRepresentation(i, nums.length);
            List<Integer> newLst = new ArrayList<>();
            for(int j=0;j<binaryRepresentation.length();j++) {
                if (binaryRepresentation.charAt(j) == '1') {
                    newLst.add(nums[j]);
                }
            }
            lst.add(newLst);
        }
    //    lst.forEach(System.out::println);
        return lst;

    }

    private String getBinaryRepresentation(int number, int length) {
        String binary = "";
        while(number!=0) {
            int quo = number%2;
            binary = binary + String.valueOf(quo) ;
            number = number/2;
        }
        return binary;
    }
}
