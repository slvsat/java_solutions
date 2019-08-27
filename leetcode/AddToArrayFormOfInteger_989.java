package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddToArrayFormOfInteger_989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int ten = 0;
        List<Integer> second = new ArrayList<>();
        while(K > 0) {
            int temp = K % 10;
            K /= 10;
            second.add(0, temp);
        }
        int[] B = second.stream().mapToInt(d->d).toArray();
        List<Integer> result;
        if (A.length > B.length) {
            result = plusArr(A, B);
        }
        else {
            result = plusArr(B, A);
        }
        return result;
    }

    private List<Integer> plusArr(int[] A, int[] B) {
        int j = B.length - 1;
        int ten = 0;
        for (int i = A.length-1; i >= 0; i--) {
            if (j >= 0) {
                if (ten != 0) {
                    A[i] += ten;
                    ten = 0;
                }
                if (A[i] + B[j] > 10) {
                    A[i] = A[i] + B[j] - 10;
                    ten = 1;
                } else if (A[i] + B[j] == 10) {
                    A[i] = 0;
                    ten = 1;
                } else {
                    A[i] = A[i] + B[j];
                }
                j--;
            } else if (ten != 0){
                if (A[i] + ten == 10) {
                    A[i] = 0;
                    ten = 1;
                } else {
                    A[i] = A[i] + ten;
                    ten = 0;
                }
            } else {
                break;
            }
        }
        if (ten != 0) {
            List<Integer> result = Arrays.stream(A).boxed().collect(Collectors.toList());
            result.add(0, 1);
            return result;
        }
        return Arrays.stream(A).boxed().collect(Collectors.toList());
    }

}
