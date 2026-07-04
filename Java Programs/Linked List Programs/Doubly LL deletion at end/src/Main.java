import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node prev;

}
class List{
    private Node head = null;
    private Node temp = null;

    void input(){
        int value;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value: ");
        value=sc.nextInt();
        Node newnode= new Node();
        newnode.data=value;
        newnode.next=null;
        newnode.prev=null;
        if(head == null){
            head= newnode;
            temp=newnode;
            return;
        }
        temp.next=newnode;
        newnode.prev=temp;
        temp=newnode;
    }
    void deletion_Last(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head=null;
            temp=null;
            return;
        }
        temp = temp.prev;
        temp.next = null;
    }
    public void display(){
        Node ptr=head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(ptr != null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        List L1=  new List();
        L1.input();
        L1.input();
        L1.input();
        L1.input();
        L1.input();
        L1.display();
        L1.deletion_Last();
        L1.display();
    }
}