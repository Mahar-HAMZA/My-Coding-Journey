import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node prev;
}
class Circle {
    private Node head = null;
    private Node temp = null;
    public void input(Scanner sc) {
        System.out.print("Enter value: ");
        int value = sc.nextInt();
        Node newnode = new Node();
        newnode.data = value;
        newnode.next=null;
        newnode.prev=null;
        if (head == null) {
            head = newnode;
            temp = newnode;
            newnode.next = newnode;
            newnode.prev = newnode;
            return;
        }
        newnode.prev = temp;
        newnode.next = head;
        temp.next = newnode;
        head.prev = newnode;
        temp = newnode;
    }
    public void Insertion_Start(Scanner sc) {
        System.out.print("Enter value: ");
        int value = sc.nextInt();

        Node newnode = new Node();
        newnode.data = value;
        newnode.next=null;
        newnode.prev=null;

        if (head == null) {
            head = newnode;
            temp = newnode;
            newnode.next = newnode;
            newnode.prev = newnode;
            return;
        }
        newnode.next = head;
        newnode.prev = temp;
        head.prev = newnode;
        temp.next = newnode;
        head = newnode;
    }
    public void insertAtPos(Scanner sc) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        System.out.print("Enter value: ");
        int value = sc.nextInt();

        Node newnode = new Node();
        newnode.data = value;
        newnode.next=null;
        newnode.prev=null;

        if (pos == 1) {
            Insertion_Start(sc);
            return;
        }
        Node ptr = head;
        int i = 1;
        while (i < pos - 1 && ptr.next != head) {
            ptr = ptr.next;
            i++;
        }
        if (ptr.next == head) {
            newnode.next = head;
            newnode.prev = temp;
            temp.next = newnode;
            head.prev = newnode;
            temp = newnode;
            return;
        }
        newnode.next = ptr.next;
        newnode.prev = ptr;
        ptr.next.prev = newnode;
        ptr.next = newnode;
    }
    public void deleteStart() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == head) {
            head = null;
            temp = null;
            return;
        }
        head = head.next;
        head.prev = temp;
        temp.next = head;
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == head) {
            head = null;
            temp = null;
            return;
        }
        temp = temp.prev;
        temp.next = head;
        head.prev = temp;
    }
    public void deleteAtPos(Scanner sc) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            deleteStart();
            return;
        }
        Node ptr = head;
        int i = 1;
        while (i < pos && ptr.next != head) {
            ptr = ptr.next;
            i++;
        }
        if (ptr == temp) {
            deleteLast();
            return;
        }
        ptr.prev.next = ptr.next;
        ptr.next.prev = ptr.prev;
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node ptr = head;
        do {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        } while (ptr != head);
        System.out.println();
    }
}
public class CircularList {
    public static void main(String[] args) {
        Circle L1 = new Circle();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Insert At Last");
            System.out.println("2. Insert At Start");
            System.out.println("3. Insert At Specific");
            System.out.println("4. Delete From Start");
            System.out.println("5. Delete From Last");
            System.out.println("6. Delete At Specific");
            System.out.println("7. Display List");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    L1.input(sc);
                    break;
                case 2:
                    L1.Insertion_Start(sc);
                    break;
                case 3:
                    L1.insertAtPos(sc);
                    break;
                case 4:
                    L1.deleteStart();
                    break;
                case 5:
                    L1.deleteLast();
                    break;
                case 6:
                    L1.deleteAtPos(sc);
                    break;
                case 7:
                    L1.display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("You entered wrong choice!");
            }
        } while(true);
    }
}
