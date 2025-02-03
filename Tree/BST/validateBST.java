public class validateBST {
    static TreeNode insert(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.data > val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }
    
    static boolean validate(TreeNode root, TreeNode min, TreeNode max) {
        if(root == null) return true;

        if(min != null && root.data < min.data) return false;
        if(max != null && root.data > max.data) return false;

        boolean validateLeft = validate(root.left, min, root);
        boolean validateRight = validate(root.right, root, max);
        return validateLeft && validateRight;
    }
    public static void main(String[] args) {
        // int[] values = {8,5,3,5,9,6,10,11};
        int[] values = {1,1,1};
        TreeNode root = null;
        // Build BST
        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        if(validate(root,null, null)) {
            System.out.println("It is BST");
        } else {
            System.out.println("It is not BST");
        }
    }
}
