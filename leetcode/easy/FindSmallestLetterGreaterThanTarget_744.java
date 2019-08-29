package leetcode.easy;

public class FindSmallestLetterGreaterThanTarget_744 {

    public char nextGreatestLetter(char[] letters, char target) {
        int minSmalest = letters[0];
        int maxSmallest = 123;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) maxSmallest = Math.min(maxSmallest, (int)letters[i]);
            if (letters[i] < target) minSmalest = Math.min(minSmalest, (int)letters[i]);
        }
        if (maxSmallest != 123) return (char)maxSmallest;
        return (char)minSmalest;
    }

    // Since array is sorted better solution comes -->
//    public char nextGreatestLetter(char[] letters, char target) {
//        for (char c: letters)
//            if (c > target) return c;
//        return letters[0];
//    }
}
