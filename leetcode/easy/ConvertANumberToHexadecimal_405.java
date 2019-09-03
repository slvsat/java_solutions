package leetcode.easy;

public class ConvertANumberToHexadecimal_405 {

    public String toHex(int num) {
        if (num == 0) return "0";
        int reminder = 0;
        String hex = "0123456789abcdef";
        StringBuilder result = new StringBuilder();
        while(num != 0) {
            reminder = num & 15;
            result.insert(0, hex.charAt(reminder));
            num >>>= 4;
        }
        return result.toString();
    }
}
