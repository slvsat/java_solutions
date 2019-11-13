package leetcode.easy;

public class ToLowerCase_709 {

    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                result.append((char)(str.charAt(i) + 32));
            } else result.append(str.charAt(i));
        }
        return result.toString();
    }

}
