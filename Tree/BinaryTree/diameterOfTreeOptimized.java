public class diameterOfTreeOptimized {

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
    static class Info {
        int diam;
        int ht;
        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    static Info calDiameter(Node root) { // O(n)
        if(root == null) {
            return new Info(0,0);
        }
        Info leftInfo = calDiameter(root.left); // calculating left info(diam,ht)
        Info rightInfo = calDiameter(root.right);// calculating righ info(diam,ht)
        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1); // calculating overall diameter by Max of (left diam, right diam, self diam)
        int height = Math.max(leftInfo.ht,rightInfo.ht) + 1; // calculating height of tree continiuous
        return new Info(diam, height); // return Object by which we can find both height and diameter
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

        System.out.println("Diameter of this tree : "+calDiameter(root).diam);

    }
}
