package leetcode.easy;

public class FactorialTrailingZeroes_172 {

    public int trailingZeroes(int n) {
        int count = 0, p = 1;
        while(n >= Math.pow(5,p)){
            count += n/Math.pow(5,p);
            p++;
        }
        return count;
    }

}
