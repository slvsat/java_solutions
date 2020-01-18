package leetcode.stormik.easy;

public class CountAndSay_38 {

    public String countAndSay(int n) {
        if (n == 1) return "1";

        StringBuilder res = new StringBuilder();
        String say = countAndSay(n - 1);

        int counter = 1;
        if (say.length() == 1) {
            res.append(1).append(say.charAt(0));
        }
        for (int i = 0; i < say.length() - 1; i++) {
            if (say.charAt(i) == say.charAt(i+1)) {
                counter++;
                if (i+1 == say.length() - 1) {
                    res.append(counter).append(say.charAt(i));
                }
            } else {
                res.append(counter).append(say.charAt(i));
                counter = 1;
                if (i + 1 == say.length() - 1) {
                    res.append(counter).append(say.charAt(i+1));
                }
            }
        }
        return res.toString();
    }

}
