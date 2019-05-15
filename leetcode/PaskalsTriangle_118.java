package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PaskalsTriangle_118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int line = 1; line <= numRows; line++)
        {
            int C=1; // used to represent C(line, i)
            List<Integer> temp = new ArrayList<>();
            for(int i = 1; i <= line; i++)
            {
                // The first value in a line is always 1
                temp.add(C);
                C = C * (line - i) / i;
            }
            result.add(temp);
        }
        return result;
    }

}
