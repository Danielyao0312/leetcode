public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
    	Stack<TreeNode>	stack = new Stack<>();
        
        if(root == null)    return res;

        TreeNode cur = root;
        
        while(cur != null || !stack.isEmpty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }

        return res;
    }
}
