package leetcode.easy;

public class MinimumMovesToEqualArrayElements_453 {

    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE, count = 0;
        for(int n : nums) {
            min = Math.min(min, n);
        }
        for(int n : nums) {
            count += n - min;
        }
        return count;
    }

}
