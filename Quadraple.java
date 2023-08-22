import java.util.*;

public class Quadraple {

    public static void main(String[] args) {
        Quadraple obj = new Quadraple();
        List<List<Integer>> lst = obj.fourSum(new int[] {2,2,2,2,2},8);
        lst.forEach(lst1 -> {
            System.out.println();
            lst1.forEach(System.out::print);
        });
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i< nums.length;i++) {
        }
        return result;
    }

}
