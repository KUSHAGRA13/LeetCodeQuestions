package BinarySearch;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        TwoSum tw = new TwoSum();
        System.out.println(Arrays.toString(tw.twoSum(arr, target)));;
    }
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        Map<Integer, ArrayList<Integer>> hm = new HashMap<>();

        for(int i=0;i< nums.length;i++) {
            if(hm.get(nums[i]) == null) {
                hm.put(nums[i], new ArrayList<>(Collections.singletonList(i)));
            }
            else
            {
                ArrayList<Integer> lst = (ArrayList<Integer>) hm.get(nums[i]);
                lst.add(i);
                hm.put(nums[i], lst);

                int finalI = i;
                hm.computeIfPresent(nums[i],(key, val)-> {
                    boolean add = val.add(finalI);
                    return val;
                });
            }
        }

        for(int i=0;i<nums.length;i++) {
            if(target-nums[i] == nums[i]) {
                if(hm.get(nums[i]) != null) {
                    List<Integer> lst = hm.get(nums[i]);
                    if(lst.size()>=2) {
                        for(int j=0;j< lst.size();j++) {
                            if(j!=i) {
                                ans[1] = lst.get(j);
                                ans[0] = i;
                                break;
                            }
                        }
                    }
                }
            }
            else {
                if(hm.get(target-nums[i])!=null) {
                    ans[0] = i;
                    ans[1] = hm.get(target-nums[i]).get(0);
                    break;
                }
            }
            if(ans[1] !=0)
                break;
        }

        return ans;
    }

}
