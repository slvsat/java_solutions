package codesignal.stormspirit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Nowrooz_vs_Coronavirus {

    // Not solved
    public String[] repeatedDNASequences(String s) {
        if (s.length() == 10) return new String[]{s};
        List<String> result = new ArrayList<String>();
        String[] response = new String[]{};
        int start = -1;
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            for (int j = i+10; j < s.length(); j++) {
                if (i+10+10 >= s.length()) {
                    result.toArray(response);
                    return response;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    if (cnt == 9) {
                        result.add(s.substring(start, i+1));
                        start = -1;
                        cnt = 0;
                        continue;
                    }
                    if (start == -1) {
                        start = i;
                    }
                    cnt++;
                } else {
                    start = -1;
                    cnt = 0;
                }
            }
        }
        result.toArray(response);
        return response;
    }

}
