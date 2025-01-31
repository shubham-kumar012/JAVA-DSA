import java.util.*;

public class kthLevelOfATree {

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

    // Method 1 - Without recursion
    static void printKthLevel(Node root, int k) {
        if(root == null) {
            System.out.println("Tree is empty");
        }
        // One more base case consider is that if k > TreeHeight so there is no level of k in tree
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        while(!q.isEmpty() && k > 1) {
            Node curr = q.remove();
            if(curr == null) {
                // System.out.println();
                k--;
                if(q.isEmpty()) {
                    break;
                }else {
                    q.add(null);
                }

            }else {
                // System.out.print(curr.data);
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        // printing kth level
        while(!q.isEmpty()) {
            if(q.peek() == null) break;
            System.out.print(q.remove().data+" ");
        }
        System.out.println();
    }

    // Method 2 - With recursion
    static void printKthLevel2(Node root, int level, int k) {
        if(root == null) return;

        if(level == k) {
            System.out.print(root.data);
            return;
        }

        printKthLevel2(root.left, level+1, k);
        printKthLevel2(root.right, level+1, k);
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

        int k = 3;

        // printKthLevel(root, k);
        printKthLevel2(root, 1, k);
    }
}
