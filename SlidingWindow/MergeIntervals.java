package SlidingWindow;


import java.util.*;

/**
 * Q56
 */
public class MergeIntervals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int[][] intervals = new int[r][2];

        for (int i=0;i<r;i++) {
            for (int j=0;j<2;j++) {
                intervals[i][j] = sc.nextInt();
            }
        }

        System.out.println(new MergeIntervals().merge(intervals));
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<List<Integer>> lst = new ArrayList<>();
        for (int i=0;i< intervals.length;i++) {
            int initialStartTime = intervals[i][0];
            int endTime = intervals[i][1];
            i++;
            while (i < intervals.length) {
                int startTime = intervals[i][0];
                if (startTime <= endTime) {
                    if (endTime < intervals[i][1])
                        endTime = intervals[i][1];
                    i++;
                } else {
                    i--;
                    lst.add(new ArrayList<>(Arrays.asList(initialStartTime, endTime)));
                    break;
                }
            }
            if (i == intervals.length) {
                lst.add(new ArrayList<>(Arrays.asList(initialStartTime, endTime)));
            }
        }

        int[][] result = new int[lst.size()][2];


        for(int i=0;i<lst.size();i++) {
            result[i][0] = lst.get(i).get(0);
            result[i][1] = lst.get(i).get(1);
        }
        return result;
    }
}
