package codesignal.stormspirit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneTech_vs_DAR_2 {

    String compareIntegers(String a, String b) {
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (Character.getNumericValue(a.charAt(i)) > Character.getNumericValue(b.charAt(i))) {
                    return "greater";
                } else if (Character.getNumericValue(a.charAt(i)) == Character.getNumericValue(b.charAt(i))) continue;
                else {
                    return "less";
                }
            }
        } else if (a.length() < b.length()) return "less";
        else return "greater";
        return "equal";
    }

    int countVowelConsonant(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) count++;
            else count = count + 2;
        }
        return count;
    }

    int[] improperFractionToMixed(int[] a) {
        int[] result = new int[3];
        int delim = a[0] / a[1];
        int full = a[0] - (delim * a[1]);
        result[0] = delim;
        result[1] = full;
        result[2] = a[1];
        return result;
    }

    int[] matrixElementsInSpiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

    }

    int maxPairProduct(int[] a) {


    }

    int digitSum(int n) {
        int cnt = 0;
        while(n != 0) {
            int temp = n % 10;
            cnt += temp;
            n = n / 10;
        }
        return cnt;
    }

    int longestIncreasingSubsequence(int[] sequence) {

    }



}
