public class deleteNodeInBST {
    // Creating BST
    static TreeNode insert(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.data > val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    // Delete Node From BST
    static TreeNode delete(TreeNode root, int val) {
        if(root.data > val) { // left subtree (val smaller then root)
            root.left = delete(root.left, val);
        } else if(root.data < val) { // right subtree (val greater then root)
            root.right = delete(root.right, val);
        } else { // val in equal(val find)
            // case 1 : No Child(leaf)
            if(root.left == null && root.right == null) {
                return null;
            }

            // case 2 : One Child
            if(root.left == null) {
                return root.right;
            }else if(root.right == null) {
                return root.left;
            }

            // case 3 : Two Child
            TreeNode IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    static TreeNode findInorderSuccessor(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
    
    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        TreeNode root = null;
        // Build BST
        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        createBST.inOrder(root);
        System.out.println();
        // Delete Node
        delete(root, 11);
        createBST.inOrder(root);

    }
}
