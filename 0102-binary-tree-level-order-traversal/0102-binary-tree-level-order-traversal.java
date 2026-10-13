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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null) return finalList;
        q.offer(root);
        while(!q.isEmpty()){
            int size= q.size();
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode a = q.poll();
            if(a.left!=null)q.offer(a.left);
            if(a.right!=null)q.offer(a.right);
            List.add(a.val);

        }
        finalList.add(List);

        
        }
        return finalList;
    }
}