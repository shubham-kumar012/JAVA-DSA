public class mirrorABST {
    static TreeNode insert(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.data > val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    static TreeNode mirror(TreeNode root) {
        if(root == null) return null;

        TreeNode leftSubtree = mirror(root.left);
        TreeNode rightSubtree = mirror(root.right);
        
        root.right = leftSubtree;
        root.left = rightSubtree;

        return root;
    }
    public static void main(String[] args) {
        /*
              8       // BST
             / \
            5   9
            /\   \
            3 6   10
           / \     \
           N  4     11
         */
        int[] values = {8,5,3,4,9,6,10,11};
        TreeNode root = null;
        // Build BST
        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        createBST.inOrder(root);

        /*
                    8
                   / \ 
                  9   5
                 /   / \
                10   6  3
                /       /\
              11       4  N
         */


         root = mirror(root);
         System.out.println();
         createBST.inOrder(root);


    }
}
