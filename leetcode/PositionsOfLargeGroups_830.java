package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PositionsOfLargeGroups_830 {

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i != S.length() - 1) {
                if (S.charAt(i) != S.charAt(i + 1)) {
                    if ((i - start) + 1 >= 3) {
                        List<Integer> tempRes = new ArrayList<>();
                        tempRes.add(start);
                        tempRes.add(i);
                        result.add(tempRes);
                        start = i + 1;
                    } else {
                        start = i + 1;
                    }
                }
            } else {
                if ((i - start) + 1 >= 3) {
                    List<Integer> tempRes = new ArrayList<>();
                    tempRes.add(start);
                    tempRes.add(i);
                    result.add(tempRes);
                }
            }
        }
        return result;
    }
}
