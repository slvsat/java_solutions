package leetcode.stormik.arrays101;

import java.util.Arrays;

public class conclusion_heightChecker {

    public int heightChecker(int[] heights) {

        int cnt = 0;
        int[] compare = new int[heights.length];

        // Copy array heights into compare
//        for (int i = 0; i < compare.length; i++) {
//            compare[i] = heights[i];
//        }
//
        // Bubble sort
//        for (int i = 0; i < heights.length-1; i++) {
//            for (int j = 0; j < heights.length-1-i; j++) {
//                if (heights[j] > heights[j+1]) {
//                    int temp = heights[j];
//                    heights[j] = heights[j+1];
//                    heights[j+1] = temp;
//                }
//            }
//        }

        System.arraycopy(heights, 0, compare, 0, compare.length);
        Arrays.sort(heights);


        for (int i = 0; i < compare.length; i++) {
            if (compare[i] != heights[i]) cnt++;
        }

        return cnt;
    }

}
