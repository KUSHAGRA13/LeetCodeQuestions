package Backtracking;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Q39
 */
public class CombinationSum {

    public static void main(String[] args) {

        List<List<Integer>> ans = new CombinationSum().combinationSum(new int[]{2,3,5},7);
        ans.forEach(lst-> lst.forEach(System.out::println));

    }

    public  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> lst = Arrays.stream(candidates).boxed().collect(Collectors.toList());
        Set<Integer> st = new TreeSet<>(lst);
        lst.clear();
        lst.addAll(st);




        getAllCombinations(lst, target, 0, new ArrayList<>(), result);
        return result;
    }

    private  void getAllCombinations(List<Integer> arr, int sum, int index,
                                                   List<Integer> ans, List<List<Integer>> result) {

        if(sum == 0) {
            result.add(new ArrayList<>(ans));
            return;
        }

        while(index!=arr.size() && sum-arr.get(index)>=0) {
            ans.add(arr.get(index));
            getAllCombinations(arr, sum-arr.get(index), index, ans, result);
            ans.remove(ans.size()-1);
            index++;
        }
    }
}
