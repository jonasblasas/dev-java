public class LinkedList {
    public class Node {
        int data;
        Node next; // singly-linked list node

        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    Node head;

    public void add(Node n) {
        if(this.head == null) {
            this.head = n;
        }

        Node cur = head;

        while(cur.next != null) {
            cur = cur.next;
        }

        cur.next = n;
    }

    public void addFirst(Node n) {
        Node tmp = this.head;
        this.head = n;
        this.head.next = tmp;
    }

    public LinkedList reversed() {
        LinkedList rev = new LinkedList();

        Node cur = this.head;
        while(cur != null) {
            rev.addFirst(new Node(cur.data));
            cur = cur.next;
        }

        return rev;
    }

    public void print() {
        System.out.println("Linked list:");
        Node cur = head;
        while(cur != null) {
            System.out.print(" "+cur.data);
            cur = cur.next;
        }
        System.out.println();
    }

    public void run() {
        this.head = new Node(10);

        add(new Node(13));
        add(new Node(14));
        add(new Node(20));
        add(new Node(69));

        print();
        reversed().print();
    }

    public static void main(String[] args) { new LinkedList().run(); }
}