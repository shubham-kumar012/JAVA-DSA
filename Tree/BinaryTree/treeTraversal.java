package Tree.BinaryTree;
import java.util.*;

public class treeTraversal {

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

    static void preOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        
        System.out.print(root.data+" "); // root
        preOrderTraversal(root.left); // left subtree
        preOrderTraversal(root.right); // right subtree
    }

    static void inOrderTraversal(Node root) {
        if(root == null) {
            return;
        }

        inOrderTraversal(root.left); // left subtree
        System.out.print(root.data+" "); // root
        inOrderTraversal(root.right); // right subtree
    }

    static void postOrderTraversal(Node root) {
        if(root == null) {
            return;
        }

        postOrderTraversal(root.left); // left subtree
        postOrderTraversal(root.right); // right subtree
        System.out.print(root.data+" "); // root
    }

    static int countLevel = 0;
    static void levelOrderTraversal(Node root) {
        if(root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                countLevel++;
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            } else { // if q node is not empty
                System.out.print(currNode.data+" ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
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

        // calling preorder traversal
        System.out.print("Pre Order Traversal : ");
        preOrderTraversal(root); // 1 2 4 5 3 6 7
        // calling inorder traversal
        System.out.print("\nIn Order Traversal : ");
        inOrderTraversal(root); // 4 2 5 1 6 3 7
        // calling postorder traversal
        System.out.print("\nPost Order Traversal : ");
        postOrderTraversal(root); // 4 5 2 6 7 3 1
        // calling level order traversal
        System.out.println("\nLevel order Traversal : ");
        levelOrderTraversal(root);
        System.out.println("Level Of A Tree : "+countLevel);

    }
}
