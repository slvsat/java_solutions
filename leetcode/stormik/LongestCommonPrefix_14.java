package leetcode.stormik;

public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        StringBuilder result = new StringBuilder();
        int minimumSymbols = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minimumSymbols) minimumSymbols = str.length();
        }
        if (minimumSymbols == 0) {
            return "";
        }
        int charPoint = 0;
        char temp = strs[0].charAt(charPoint);
        int pointer = 0;
        for (int j = 0; j < minimumSymbols; j++) {
            for (String str : strs) {
                if (str.charAt(pointer) != temp) {
                    return result.toString();
                }
            }
            result.append(temp);
            if (pointer == minimumSymbols - 1) {
                return result.toString();
            }
            charPoint++;
            temp = strs[0].charAt(charPoint);
            pointer++;
        }
        return result.toString();
    }

}
