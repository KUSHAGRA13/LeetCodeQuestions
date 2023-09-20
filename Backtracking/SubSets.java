package Backtracking;
import java.util.*;
/**
 * Q77
 */
public class SubSets extends Input{
    public static void main(String[] args) {

        new SubSets().subsets(arr);

    }

    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        combination(arr,0, res, new ArrayList<>());
        return res;
    }

    private void combination(int[] arr, int begin, List<List<Integer>> res, List<Integer> lst) {
        if (begin == arr.length) {
            res.add(new ArrayList<>(lst));
            return;
        }
        combination(arr, begin+1,res, lst);
        lst.add(arr[begin]);
        combination(arr,begin+1, res, lst);
        lst.remove(lst.size()-1);
    }
}
