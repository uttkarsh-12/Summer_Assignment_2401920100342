import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> res=new ArrayList<>();
         int step=-1;
       if(root==null) return res;
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
        int size=q.size();
        List<Integer> level = new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode node=q.poll();
            level.add(node.val);
            if(node.left!=null) q.add(node.left);
            if(node.right!=null)q.add(node.right);

        }
        step++;
        if(step%2==0)  res.add(level);
        else{
            Collections.reverse(level);
            res.add(level);
        }

       }
       return res;
        
    }
}