package leetcode.stormik.easy;

public class PlusOne_66 {

    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length-1]++;
        for (int i = digits.length - 1; i >=0; i--) {
            if (digits[i] >= 10) {
                digits[i] = digits[i] - 10;
                carry++;
            } else {
                digits[i] = digits[i] + carry;
                carry = 0;
                if (digits[i] >= 10) {
                    digits[i] = digits[i] - 10;
                    carry++;
                }
            }
        }
        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            return  result;
        }
        return digits;
    }

}
