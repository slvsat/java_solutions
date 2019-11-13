package leetcode.easy;

import java.util.Arrays;

public class RansomNote_383 {

    public boolean canConstruct(String ransomNote, String magazine) {

        char[] ranNote = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        Arrays.sort(ranNote);
        Arrays.sort(mag);
        if (ranNote.length > mag.length) return false;
        int i = 0;
        for (int j = 0; j < mag.length; j++) {
            if (i < ranNote.length) {
                if (ranNote[i] == mag[j]) {
                    i++;
                }
            }
            else {
                break;
            }
        }
        if (i != ranNote.length) return false;
        return true;

    }

}
