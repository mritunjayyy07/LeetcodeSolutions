/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> lst = new ArrayList<> ();
        //List <Integer> q = new ArrayList<>();
        if(root == null)
            return lst;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int qs = q.size();
            List <Integer> slst = new ArrayList<>();
            for(int i =1; i<= qs; i++)
            {
                TreeNode node = q.poll();
                slst.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);

            }
            lst.add(slst);
        }
        Collections.reverse(lst);
        return lst;
        
    }
}