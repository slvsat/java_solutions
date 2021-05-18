package leetcode.stormik.arrays;

public class insert_duplicateZeros {

    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int l = 0, r = arr.length;
        while (l < r) {
            if (arr[l] == 0) {
                possibleDups++;
                if (l != r-1) r--;
            }
            l++;
        }
        System.out.println(possibleDups);

        int point = arr.length-1;
        int diff = arr.length - r;

        System.out.println(diff);
        if ((possibleDups - diff) > 0) {
            arr[point] = 0;
            point--;
        }

        for (int i = arr.length-1-possibleDups; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[point] = 0;
                arr[point-1] = 0;
                point -= 2;
            } else {
                arr[point] = arr[i];
                point--;
            }
        }

    }

}
