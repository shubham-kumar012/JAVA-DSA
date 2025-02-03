public class searchInBST {

    static boolean search(TreeNode root, int val) {
        if(root == null) return false;

        if(root.data > val) {
            // left subtree
            return search(root.left, val);
        } else if(root.data < val) {
            // right subtree
            return search(root.right, val);
        } else { // when value are equal to root value
            return true;
        }
    }
    public static void main(String[] args) {
        // Build BST
        /*
                 5
               /  \
               1  7
                \
                 3
                / \
               2   4
        
        */        
        TreeNode root= new TreeNode(5);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(2);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(7);


        if(search(root, 6)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not Found!");
        }

    }
}
