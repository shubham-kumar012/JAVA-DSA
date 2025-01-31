package Tree.BinaryTree;

public class binaryTreeFromPreorder {

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

    static class Btree {
        static int idx = -1;
        static Node buildTree(int[] nodes) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            } 

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }


    }
    public static void main(String[] args) {
        int[] preorder = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Btree tree = new Btree();
        Node root = tree.buildTree(preorder);
        System.out.println(root.data);
    }
}
