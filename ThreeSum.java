import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum obj = new ThreeSum();
        List<List<Integer>> lst = obj.threeSum(new int[] {-1,0,1,2,-1,-4});
        lst.forEach(lst1 -> {
            System.out.println();
            lst1.forEach(System.out::print);
        });
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> tempResult = new HashSet<>();
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            hm.put(nums[i],i);
        }


        for(int i=0;i< nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(hm.containsKey(-1*(nums[i]+nums[j]))) {
                    int k = hm.get(-1*(nums[i]+nums[j]));
                    if(i<k && j<k) {
                        tempResult.add(Arrays.asList(nums[i], nums[j], -1*(nums[i]+nums[j])));
                    }
                }
            }
        }
        return new ArrayList<>(tempResult);
    }

    private int search(int[] nums, int begin, int element) {

        int end = nums.length-1,mid;
        while(begin<=end) {
            mid = (begin+end)/2;
            if(nums[mid] == element)
                return mid;
            else if(nums[mid] > element) {
                end = mid-1;
            }
            else
                begin =mid+1;
        }
        return -1;
    }


    private boolean isValidTriplet(List<List<Integer>> result, List<Integer> asList) {

        for (List<Integer> integers : result) {
            if (isEqual(integers, asList)) {
                return false;
            }
        }
        return true;
    }

    private boolean isEqual(List<Integer> lst1, List<Integer> lst2) {
        int number =0;
        List<Integer> copylst1 = lst1;
        List<Integer> copylst2 = lst2;

        Collections.sort(copylst1);
        Collections.sort(copylst2);

        for(int i=0;i<3;i++) {
            if(copylst1.get(i) == copylst2.get(i))
                number++;
        }

        if(number ==3)
            return true;

        return false;
    }
}
