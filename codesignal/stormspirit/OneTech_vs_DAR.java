package codesignal.stormspirit;

import java.util.Arrays;

public class OneTech_vs_DAR {

    public int specialPolynomial(int x, int n) {
        int d = 0;
        int k = 0;
        while (d <= n) {
            d = d + (int)Math.pow(x, k);
            k++;
        }
        return k - 1;
    }

    boolean areSimilar(int[] a, int[] b) {
        if (a.length != b.length) return false;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) cnt++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return cnt <= 2;
    }

    int arrayConversion(int[] inputArray) {
        if (inputArray.length == 1) return inputArray[0];
        int cnt = inputArray.length;
        int step = 1;
        while (cnt != 1) {
            int newCnt = 0;
            int inx = 0;
            for (int i = 0; i < cnt; i = i + 2) {
                if (step % 2 == 1) {
                    int sum = inputArray[i] + inputArray[i+1];
                    inputArray[inx] = sum;
                    inx++;
                    newCnt++;
                } else {
                    int prod = inputArray[i] * inputArray[i+1];
                    inputArray[inx] = prod;
                    newCnt++;
                    inx++;
                }
            }
            step++;
            cnt = newCnt;
        }
        return inputArray[0];
    }

    int[] directionOfReading(int[] numbers) {
        if (numbers.length == 1) return numbers;
        int mainNumber = (int)Math.pow(10, numbers.length);
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int res = mainNumber + numbers[i];
            numbers[i] = res;
        };
        int lastOne = numbers.length - 1;
        for (int d = 0; d < numbers.length; d++) {
            int tempRes = 0;
            for (int i = 0; i < numbers.length; i++) {
                tempRes = tempRes * 10 + (numbers[i] % 10);
                numbers[i] = numbers[i] / 10;
            }
            result[lastOne] = tempRes;
            lastOne--;
        }
        return result;
    }

}
