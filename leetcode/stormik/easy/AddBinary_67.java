package leetcode.stormik.easy;

public class AddBinary_67 {

    public String addBinary(String a, String b) {

        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int f = 0;
        int s = 0;
        while(i >= 0 || j >= 0) {
            f = j < 0 ? 0 : b.charAt(j) - '0';
            s = i < 0 ? 0 : a.charAt(i) - '0';
            result.insert(0, (f + s + carry) % 2);
            carry = (f + s + carry) / 2;
            i--;
            j--;
        }
        if (carry != 0) {
            result.insert(0, '1');
        }
        return result.toString();

    }

}
