package mergeIntervals;

import java.util.*;

public class Q56 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        List<int[]> list = new ArrayList();
        for (int i = 0; i < intervals.length; i++) {
            if (list.size() == 0) {
                list.add(intervals[i]);
            } else if (intervals[i][0] > list.get(list.size() - 1)[1]) {
                list.add(intervals[i]);
            } else {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], intervals[i][1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        merge(intervals);
    }
}
