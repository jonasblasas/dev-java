public class BinarySearchTree {
    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int value) {
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public boolean IsBST(Node n, int min, int max) {
        if(n == null) {
            return true;
        }

        if(n.data > max || n.data < min) {
            return false;
        }

        return IsBST(n.left, min, n.data-1) && IsBST(n.right, n.data+1, max);
    }

    public void run() {

        /*
             10
           /    \
          6      15
         / \    /  \
        1   8  12   16
        */
        this.root = new Node(10);

        this.root.left = new Node(6);
        this.root.right = new Node(15);

        this.root.left.left = new Node(1);
        this.root.left.right = new Node(8);

        this.root.right.left = new Node(12);
        this.root.right.right = new Node(16);

        System.out.println("Binary tree is bst: " + IsBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public static void main(String[] args) { new BinarySearchTree().run(); }
}