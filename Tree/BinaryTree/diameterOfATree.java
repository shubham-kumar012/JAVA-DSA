public class diameterOfATree {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // To calculating height of a tree
    static int height(Node root) {
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }

    // To calculating diameter of a tree
    static int calDiameter(Node root) { // O(n^2)
        if(root == null) return 0;

        int lDiam = calDiameter(root.left); // calculating left diameter
        int rDiam = calDiameter(root.right); // calculating right diameter
        int lh = height(root.left); // calculating left height of a tree
        int rh = height(root.right); // calculating right height of a tree
        int selfDiam = (lh + rh) + 1;
        return Math.max(selfDiam, Math.max(lDiam, rDiam));
    }
    public static void main(String[] args) {
         /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
         */
        Node root = new Node(1);
        // creating left subtree of root
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // creating right subtree of root
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Diameter Of This Tree : "+calDiameter(root));
    }
}
