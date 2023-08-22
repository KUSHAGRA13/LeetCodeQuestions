package Backtracking;

/**
 * Get all permutation for a String
 */
public class StringPermutation {

    public static void main(String[] args) {
        String str = "abc";
         new StringPermutation().getAllPermutations(new char[]{'a', 'b', 'c'},0,2);
    }

    void getAllPermutations(char[] arr, int l,int r) {
        if(l==r) {
            System.out.println(String.valueOf(arr));
            return;
        }
        for(int i=l;i<arr.length;i++) {
            swap(arr, l, i);
            getAllPermutations(arr, l+1, r);
            swap(arr,i,l);
        }
    }

    private void swap(char[] arr, int i, int j) {
        char a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
}
