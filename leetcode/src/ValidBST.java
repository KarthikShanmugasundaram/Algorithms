
public class ValidBST {

	public boolean isValidBST(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        
        if (root.val <= min || root.val >= max) {
            return false;
        }
        
        boolean left = isBST(root.left, min, root.val);
        boolean right = isBST(root.right, root.val, max);
        
        return left && right;
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
