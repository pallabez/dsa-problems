import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>(); 
        Deque<TreeNode> q = new ArrayDeque<TreeNode>();
        
        if (root != null) q.addLast(root);
        while (!q.isEmpty()) {
            Deque<TreeNode> newStack = new ArrayDeque<TreeNode>();
            result.add(q.getLast().val);
            while (!q.isEmpty()) {
                TreeNode curr = q.removeFirst();
                TreeNode left = curr.left;
                TreeNode right = curr.right;

                if (left != null) newStack.addLast(left);
                if (right != null) newStack.addLast(right);
            }

            q = newStack;
        }

        return result;
    }
}

public class binary_tree_right_side_view {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        List<Integer> result = s.rightSideView(t1);
        System.out.println(result);
    }
}
