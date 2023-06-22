package Jun.Day22;

import com.sun.source.tree.ReturnTree;

public class InvertBinaryTree {

    public static class TreeNode {
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

    public TreeNode invertTree(TreeNode root) {

        if (root == null){
            return null ;
        }
        invertTree(root.left);
        invertTree(root.right);

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp    ;

        return root;
    }
    public static void printTree(TreeNode root){
        if(root==null)
            return;
        System.out.println(root.val);
        printTree(root.right);
        printTree(root.left);


    }


    public static void main(String[] args) {

        TreeNode theTree = new TreeNode(4,
                new TreeNode(2,new TreeNode(1),new TreeNode(3)),
                new TreeNode(7,new TreeNode(9),new TreeNode(6)));
        printTree(theTree);

    }
}
