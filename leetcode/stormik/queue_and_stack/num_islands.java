package leetcode.stormik.queue_and_stack;

import com.sun.tools.javac.util.Pair;

import java.util.*;

public class num_islands {

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int numberOfIslands = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    Queue<int[]> ones = new LinkedList<>();
                    ones.add(new int[]{i, j});
                    grid[i][j] = '0';
                    while (!ones.isEmpty()) {
                        int[] curr = ones.poll();
                        int f = curr[0];
                        int s = curr[1];
                        if (s + 1 < m) {
                            if (grid[f][s+1] == '1') {
                                ones.add(new int[]{f, s+1});
                                grid[f][s+1] = '0';
                            }
                        }
                        if (f + 1 < n) {
                            if(grid[f+1][s] == '1') {
                                ones.add(new int[]{f+1, s});
                                grid[f+1][s] = '0';
                            }
                        }
                        if (f - 1 >= 0) {
                            if (grid[f-1][s] == '1') {
                                ones.add(new int[]{f-1, s});
                                grid[f-1][s] = '0';
                            }
                        }
                        if (s - 1 >= 0) {
                            if (grid[f][s-1] == '1') {
                                ones.add(new int[]{f, s-1});
                                grid[f][s-1] = '0';
                            }
                        }
                    }
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
    }

}
