package leetcode.stormik.arrays;

public class search_validMountainArray {

    public boolean validMountainArray(int[] arr) {

        if (arr.length < 3) return false;

        boolean desc = false;
        int point = -1;

        for (int i = 0; i < arr.length; i++) {

            if (desc && point > arr[i]) point = arr[i];
            else if (!desc && point < arr[i]) point = arr[i];
            else if (point == arr[i]) return false;
            else if (!desc && point > arr[i] && i != 1) {
                desc = true;
                point = arr[i];
            } else return false;
        }

        return desc;
    }

}
