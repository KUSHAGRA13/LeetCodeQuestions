package Backtracking;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Q40
 */
public class CombinationSum2 {

    public static void main(String[] args) {
        System.out.println( new CombinationSum2().combinationSum2(new int[]{2,2,2}, 2));
    }

    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> lst = Arrays.stream(arr).boxed().collect(Collectors.toList());
        getAllCombinations(lst, target, 0, new ArrayList<>(), result);
        return new ArrayList<>(result);


    }

    private void getAllCombinations(List<Integer> lst, int sum, int index,
                                    ArrayList<Integer> ans, List<List<Integer>> result) {
        if(sum ==0) {
            result.add(new ArrayList<>(ans));
            return;
        }
        while (index!=lst.size() && sum-lst.get(index)>=0) {
            ans.add(lst.get(index));
            getAllCombinations(lst,sum-lst.get(index), index+1,ans,result);
            ans.remove(ans.size()-1);
            while (index<lst.size()-1) {
                if(Objects.equals(lst.get(index), lst.get(index + 1)))
                    index++;
            }
            index++;
        }
    }
}
