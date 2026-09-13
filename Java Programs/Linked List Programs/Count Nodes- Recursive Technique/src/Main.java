class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    Node head = null;
    Node temp = null;


    public void addNode(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            temp = newNode;
            return;
        }
        temp.next = newNode;
        temp = newNode;
    }

    public void countNodes(Node head) {
        int totalNodes = countNodeHelper(head, 0);
        System.out.println("Total Nodes: " + totalNodes);
    }

    private int countNodeHelper(Node counter, int count) {
        if (counter == null) {
            return count;
        }
        return countNodeHelper(counter.next, count + 1);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        list.countNodes(list.head);
    }
}