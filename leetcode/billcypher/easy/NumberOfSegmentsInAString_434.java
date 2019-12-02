package billcypher.easy;

public class NumberOfSegmentsInAString_434 {

    public int countSegments(String s) {
        if (s.length() < 1) return 0;
        int segments = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                segments++;
            }
        }
        return segments;
    }

}
