package leetcode.stormik.easy;

import structures.TreeNode;
import java.math.*;

public class ConvertSortedArrayToBinarySearchTree_108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return goTree(nums, 0, nums.length-1);
    }

    public TreeNode goTree(int[] nums, int lo, int high) {
        if (lo > high) return null;
        // To result like in Leetcode -> not using ceil giving another BST
        double asn = Math.ceil(((double)high - (double)lo)/2);
        int mid = (lo + (int)asn);
        TreeNode current = new TreeNode(nums[mid]);

        current.right = goTree(nums, mid + 1, high);
        current.left = goTree(nums, lo, mid - 1);
        return current;
    }

}
