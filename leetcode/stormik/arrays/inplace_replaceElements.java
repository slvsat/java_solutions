package leetcode.stormik.arrays;

public class inplace_replaceElements {

    public int[] replaceElements(int[] arr) {
        if (arr == null) return null;

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) arr[i] = -1;
            else {
                int max = 0;
                for (int k = i+1; k < arr.length; k++) {
                    if (arr[k] > max) max = arr[k];
                }
                arr[i] = max;
            }
        }

        return arr;
    }

}
