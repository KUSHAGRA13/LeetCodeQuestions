package Backtracking;

import java.util.*;

/**
 * Q77
 */
public class Combinations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        new Combinations().combine(n, k);

    }

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res = new ArrayList<>();
        getAllCombinations(n, k, 1, res, new ArrayList<>(),0);
        res.forEach(System.out::println);
        return res;

    }

    private void getAllCombinations(int n, int k, int index, List<List<Integer>> res, List<Integer> lst, int arrIndex) {

        if (index>(n+1)) {
            return;
        }
        if(k==0) {
            res.add(new ArrayList<>(lst));
            lst.remove(lst.size()-1);
            getAllCombinations(n,k+1,index,res,lst,0);
        }
        if(k<0)
            return;
        lst.add(index);
        getAllCombinations(n,k-1, index+1, res, lst,0);


    }
}
