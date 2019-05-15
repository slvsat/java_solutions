package leetcode;

public class ExcelSheetColumnTitle_168 {

    // Runtime: 0 ms - Not my submission
    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n/26) + (char)('A' + (n % 26));
    }

}
