package leetcode.stormik.queue_and_stack;

import java.util.Arrays;
import java.util.Stack;

public class dfs_num_islands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int i, int j) {
        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            if (j + 1 < grid[0].length) dfs(grid, i, j + 1);
            if (i + 1 < grid.length) dfs(grid, i + 1, j);
            if (j - 1 >= 0) dfs(grid, i, j - 1);
            if (i - 1 >= 0) dfs(grid, i - 1, j);
        }
    }

}
