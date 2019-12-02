package billcypher.easy;

public class AddStrings_415 {

    public String addStrings(String num1, String num2) {
        if (num1.length() == 0) return num2;
        if (num2.length() == 0) return num1;
        int carry = 0;
        char[] fr;
        char[] sd;
        StringBuilder res = new StringBuilder();
        if (num1.length() > num2.length()) {
            fr = num1.toCharArray();
            sd = num2.toCharArray();
        } else if (num2.length() > num1.length()) {
            fr = num2.toCharArray();
            sd = num1.toCharArray();
        } else {
            fr = num1.toCharArray();
            sd = num2.toCharArray();
        }
        int j = sd.length - 1;
        for (int i = fr.length - 1; i >= 0; i--) {
            if (j >= 0) {
                int tempRes = Integer.parseInt(String.valueOf(fr[i])) + Integer.parseInt(String.valueOf(sd[j])) + carry;
                if (tempRes >= 10) {
                    if (tempRes >= 20) {
                        res.insert(0, tempRes - 20);
                        carry = 2;
                    } else if (tempRes < 20) {
                        res.insert(0, tempRes - 10);
                        carry = 1;
                    } else {
                        res.insert(0, tempRes - 10);
                        carry = 1;
                    }
                } else {
                    res.insert(0, tempRes);
                    carry = 0;
                }
                j--;
            } else {
                int tempRes = Integer.parseInt(String.valueOf(fr[i])) + carry;
                if (tempRes >= 10) {
                    res.insert(0, tempRes - 10);
                    carry = 1;
                } else {
                    res.insert(0, tempRes);
                    carry = 0;
                }
            }
        }
        if (carry > 0) {
            res.insert(0, carry);
        }
        return res.toString();
    }

}
