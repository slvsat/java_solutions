package leetcode.stormik.arrays101;

public class insert_mergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int insertPos = -1;
        if (m == 0 && n != 0) insertPos = n - 1;
        else if (m != 0 && n == 0) insertPos = m - 1;
        else if (m != 0 && n != 0) insertPos = m + n -1;

        int secondPos = n==0 ? -1 : n - 1;
        int firstPos = m==0? -1 : m - 1;

        while(firstPos != -1 && secondPos != -1) {
            if (nums2[secondPos] > nums1[firstPos]) {
                nums1[insertPos] = nums2[secondPos];
                secondPos--;
            } else {
                nums1[insertPos] = nums1[firstPos];
                firstPos--;
            }
            insertPos--;
        }

        if (firstPos == -1 && secondPos != -1) {
            while(secondPos != -1) {
                nums1[insertPos] = nums2[secondPos];
                secondPos--;
                insertPos--;
            }
        } else if (secondPos == -1 && firstPos != -1) {
            while(firstPos != -1) {
                nums1[insertPos] = nums1[firstPos];
                firstPos--;
                insertPos--;
            }
        }

    }

}
