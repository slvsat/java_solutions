package leetcode.stormik.arrays101;

public class conclusion_sortedSquares {

    public int[] sortedSquares(int[] nums) {
        int[] sortedSquares = new int[nums.length];

        int head = 0;
        int tail = nums.length - 1;
        int sortedSquare = nums.length - 1;

        while(head <= tail) {
            if (Math.abs(nums[head]) > Math.abs(nums[tail])) {
                sortedSquares[sortedSquare--] = nums[head] * nums[head];
                head++;
            } else {
                sortedSquares[sortedSquare--] = nums[tail] * nums[tail];
                tail--;
            }
        }
        return sortedSquares;
    }

}
