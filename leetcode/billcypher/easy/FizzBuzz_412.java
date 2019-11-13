package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_412 {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) return result;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) result.add("Fizz");
            else if (i % 5 == 0 && i % 3 != 0) result.add("Buzz");
            else if (i % 5 == 0 && i % 3 == 0) result.add("FizzBuzz");
            else result.add(Integer.toString(i));
        }
        return result;
    }

}
