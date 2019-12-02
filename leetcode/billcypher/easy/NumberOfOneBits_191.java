package billcypher.easy;

public class NumberOfOneBits_191 {

    public int hammingWeight(int n) {
        int cnt = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) cnt++;
            mask <<= 1;
        }
        return cnt;
    }

}
