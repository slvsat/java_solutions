package billcypher.easy;

public class ExcelSheetColumnNumber_171 {


    // Runtime: 1 ms
    public int titleToNumber(String s) {
        return s.length() == 1 ? s.charAt(0) - 'A' + 1 : titleToNumber(s.substring(0, s.length() - 1)) * 26 + (s.charAt(s.length() - 1) - 'A' + 1);
    }

}
