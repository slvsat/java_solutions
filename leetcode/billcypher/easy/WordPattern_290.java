package billcypher.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {

    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) return false;
        Map<String, Character> res = new HashMap<>();
        for (int i = 0; i<pattern.length(); i++) {
            if (!res.containsKey(words[i])) {
                if (!res.containsValue(pattern.charAt(i))) {
                    res.put(words[i], pattern.charAt(i));
                    continue;
                }
                return false;
            }
            if (!res.get(words[i]).equals(pattern.charAt(i))) return false;
        }
        return true;
    }

}