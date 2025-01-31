public class transformToSumTree {

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

    static int transformTree(Node root) {
        if(root == null) return 0;

        int leftChild = transformTree(root.left);
        int rightChild = transformTree(root.right);

        int data = root.data;
        // root.data = leftChild + root.left.data + rightChild + root.right.data; // we don't do like this to add left and right node values beacause it can also be null so we have to check before adding to it
        
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = leftChild + newLeft + rightChild + newRight;
        return data;
    } 

    static void preOrder(Node root) {
        if(root == null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
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

        preOrder(root);
        System.out.println();
        transformTree(root);
        preOrder(root);
    }
}
