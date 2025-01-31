public class countNodeInATree {

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

    static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int lc = countNodes(root.left); // count for left
        int rc = countNodes(root.right); // count for right
        int totalCount = (lc + rc) + 1; // total count
        return totalCount;
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

        System.out.println("Total No. Of Nodes : "+countNodes(root));
    }
}
