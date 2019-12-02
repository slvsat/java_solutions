package billcypher.easy;

import structures.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths_257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        if (root != null) searchBTPath(root, sb, res);
        return res;
    }

    private void searchBTPath(TreeNode root, StringBuilder sb, List<String> result) {
        if (root == null) return;
        int len = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null) result.add(sb.toString());
        else {
            sb.append("->");
            searchBTPath(root.left, sb, result);
            searchBTPath(root.right, sb, result);
        }
        sb.setLength(len);
    }

}
