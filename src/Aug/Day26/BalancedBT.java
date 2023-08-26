package Aug.Day26;

public class BalancedBT {


     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

    public boolean isBalanced(TreeNode root) {

         if(root==null)
             return true;
         int res = check(root);

         return res != -1;
    }

    public int check(TreeNode root){

         if(root == null) return 0;
         int r = check(root.right);
         int l = check(root.left);

         if(r==-1 || l==-1)
             return -1;
         if(Math.abs(r-l)>1)
             return -1;

         return 1+Math.max(r,l);

    }

}
