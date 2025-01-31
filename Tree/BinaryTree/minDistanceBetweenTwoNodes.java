

class minDistanceBetweenTwoNodes {

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

    public static Node lca2(Node root, int n1, int n2) {
        if(root == null) return null;
        if(root.data == n1 || root.data == n2) return root;

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(leftLca == null) return rightLca;
        if(rightLca == null) return leftLca;
        return root;
    }

    static int lcaDist(Node root, int n) {
        if(root == null) return -1;
        if(root.data == n) return 0;

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1) return -1;
        else if(leftDist == -1) return rightDist+1;
        else return leftDist+1;

    }

    // Finding Min Distance
    static int minDist(Node root,int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }


    // find Kth Ancestor of node 
    static int kAncestor(Node root, int n, int k) {
        if(root == null) return -1;
        if(root.data == n) return 0;

        int leftDist = kAncestor(root.left, n, k);
        int rightDist = kAncestor(root.right, n, k);

        int max = Math.max(leftDist, rightDist);
        if((max+1) == k) {
            System.out.println(root.data);
        }

        return max+1;
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

        int n1 = 4;
        int n2 = 6;
        // System.out.println(minDist(root, n1, n2));

        // find kth ancestor of node
        kAncestor(root, 5, 2);
    }
}