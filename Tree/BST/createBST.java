public class createBST {

    static TreeNode insert(TreeNode root, int val) {
        if(root == null) {
            root = new TreeNode(val);
            return root;
        }

        if(root.data > val) {
            // insert on left
            root.left = insert(root.left, val);
        } else { // if(root.data < val)
            // insert on right
            root.right = insert(root.right, val);
        }

        return root;
    }

    static void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        TreeNode root = null;
        
        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
        
    }    
}
