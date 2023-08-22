package Backtracking;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.swap;

/**
 *  Q46,47
 */
public class ArrayPermutation {

    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>(Arrays.asList(1,2,3));
        swap(lst1, 0,2);
        System.out.println(lst1);
        List<List<Integer>> lst = new ArrayPermutation().permute(new int[]{1, 1, 3});
        System.out.println(lst);

    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> lst = Arrays.stream(nums).boxed()
                .collect(Collectors.toList());
        Set<List<Integer>> result = new HashSet<>();
        generate(lst, 0, lst.size(), result);

        List<List<Integer>> result12 = new ArrayList<>(result);
        return result12;
    }

    public void generate(List<Integer> lst, int l, int r, Set<List<Integer>> result) {
        if (l == r) {
            result.add(new ArrayList<>(lst));
            return;
        }
        for (int i = l; i < lst.size(); i++) {

                swap(lst, i, l);
                generate(lst, l + 1, r, result);
                swap(lst, i, l);
        }
    }
}
