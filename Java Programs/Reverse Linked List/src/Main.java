import java.util.Scanner;
class Node {
    public int rollNo;
    public Node node;

    public Node(int rollNo, Node node) {
        this.rollNo=rollNo;
        this.node=node;
    }
}
class List {
    public Node head;
    private Node temp;
    Scanner sc=new Scanner(System.in);
    public void insertEnd() {
        System.out.print("Enter Roll No: ");
        int rollNo=sc.nextInt();
        Node newNode=new Node(rollNo, null);
        if (head == null) {
            head=newNode;
            temp=newNode;
            return;
        }
        temp.node=newNode;
        temp=newNode;
    }

    public Node reverseList(Node head) {
        if (head == null) {
            return null;
        }

        if (head.node == null) {
            return head;
        }
        Node newHead=reverseList(head.node);
        head.node.node=head;
        head.node=null;

        return newHead;
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.rollNo + " ");
            current=current.node;
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        List list1 = new List();
        list1.insertEnd();
        list1.insertEnd();
        list1.insertEnd();
        list1.insertEnd();
        list1.insertEnd();
        list1.insertEnd();

        System.out.println("Original List:");
        list1.display();
        list1.head=list1.reverseList(list1.head);
        System.out.println("Reversed List:");
        list1.display();
    }
}