package leetcode.structures;

import java.util.List;

public class LevelNode {

    public int val;
    public List<LevelNode> children;

    public LevelNode() {}

    public LevelNode(int _val, List<LevelNode> _children) {
        val = _val;
        children = _children;
    }

}
