package billcypher.easy;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

public class IsSubsequence_392 {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;
        if (s.length() > t.length()) return false;
        char[] subs = s.toCharArray();
        char[] itselft = t.toCharArray();
        int i = 0;
        for (int j = 0; j < itselft.length; j++) {
            if (i < subs.length && itselft[j] == subs[i]) {
                i++;
            } else if (i == subs.length) return true;
        }
        return i == subs.length;
    }

}
