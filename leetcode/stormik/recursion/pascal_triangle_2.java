package leetcode.stormik.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascal_triangle_2 {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return Arrays.asList(1);

        List<Integer> current = new ArrayList<>();
        List<Integer> above = getRow(rowIndex - 1);

        for (int i = 0; i < rowIndex + 1; i++) {
            int l = 0;
            int r = 0;

            if (i > 0) l = above.get(i-1);
            if (i < rowIndex) r = above.get(i);

            current.add(l + r);
        }
        return current;
    }
}
