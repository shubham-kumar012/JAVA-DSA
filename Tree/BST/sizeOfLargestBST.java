public class sizeOfLargestBST {

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;
        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    static Info largestBST(TreeNode root) {
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1; // Calculate size for every subtree
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min)); // Calculate min
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max)); // Calculate max
        // Calculate Info
        if(root.data <= leftInfo.max || root.data >= rightInfo.min) { // BST false conditions
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBST && rightInfo.isBST) { // If left tree & right tree both true so it is valid BST, then increase maxBST size as well
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max); // If both are not true so return false
    }

    public static void main(String[] args) {
        /*
                     50
                    / \
                   30  60
                  / \   /\
                  5 20 45 70
                          /\
                         65 80
                   Given BT
         */
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(20);
        // right subtree
        root.right = new TreeNode(60);
        root.right.left = new TreeNode(45);
        root.right.right = new TreeNode(70);
        root.right.right.left = new TreeNode(65);
        root.right.right.right = new TreeNode(80);

        /*
                60
               /  \
              45  70
                 /  \
                65  80 
            Expected BST : Size - 5
         */

        largestBST(root); // call for calculate largest BST
        System.out.println("Size : "+maxBST);

    }
}
