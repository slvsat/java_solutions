package leetcode.stormik.easy;

public class ValidMountainArray_941 {

    public boolean validMountainArray(int[] A) {
        if (A.length < 3) return false;

        boolean up = true;

        if (A[0] > A[1]) return false;

        for (int i = 1; i < A.length; i++) {
            if (up) {
                if (A[i] == A[i-1]) return false;
                if (A[i] < A[i-1]) up = false;
            } else {
                if (A[i] == A[i-1]) return false;
                if (A[i] > A[i-1]) return false;
            }
        }
        return !up;
    }

}
