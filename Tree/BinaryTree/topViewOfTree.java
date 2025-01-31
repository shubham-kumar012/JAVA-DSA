import java.util.*;

public class topViewOfTree {

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

    // Creating DataType to store both Node and height distance(hd)
    static class Info {
        Node node;
        int hd;
        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    // For Top View of Tree
    static void topView(Node root) {
        // Level Order Traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = 0, max = 0;

        q.add(new Info(root, 0));
        q.add(null);
        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                }else {
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.hd)) { // if hd node is unique so put in map
                    map.put(curr.hd, curr.node.data);
                }

                if(curr.node.left != null) { // if left node exist then add it into queue
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }

                if(curr.node.right != null) { // if right node exist then add it into queue
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }

        for(int i=min; i<=max; i++) {
            System.out.print(map.get(i)+" ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
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

        topView(root); // calling top view
    }
}
