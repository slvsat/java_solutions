package billcypher.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch_401 {

    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int k = 0; k < 60; k++) {
                if (hammingWeight(i) + hammingWeight(k) == num) {
                    result.add(String.format("%d:%02d", i, k));
                }
            }
        }
        return result;
    }

    private int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }

}
