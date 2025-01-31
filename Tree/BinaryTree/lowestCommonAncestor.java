import java.util.ArrayList;

public class lowestCommonAncestor {

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

    static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if(root == null) {
            return false;
        }
        path.add(root); // adding to path
        if(root.data == n) { // if match to n so return 
            return true;
        }
        boolean findLeft = getPath(root.left, n, path); // find on left subtree
        boolean findRight = getPath(root.right, n, path); // find on right subtree

        if(findLeft || findRight) { // if any from side element were found so return true
            return true;
        }
        
        // if both side node were not find
        path.remove(path.size()-1);
        return false;

    }

    static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for(; i<path1.size() && i<path2.size(); i++) {
            if(path1.get(i) != path2.get(i)) {
                break;
            }
        }

        return path1.get(i-1);
    }


    // Without using extra space
    public static Node lca2(Node root, int n1, int n2) {
        if(root == null) {
            return null;
        }

        if(root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(leftLca == null) {
            return rightLca;
        }
        if(rightLca == null) {
            return leftLca;
        }
        return root;
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

        int n1 = 6, n2 = 7;
        System.out.println(lca2(root, n1, n2).data);
    }
}
