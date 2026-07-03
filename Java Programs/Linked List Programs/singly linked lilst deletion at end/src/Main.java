import java.util.Scanner;
class Node{
    public int data;
    public Node next;

}
class List{
    private Node head=null;
    private Node temp=null;

    public void input(){
        int value;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value: ");
        value=sc.nextInt();
        Node newnode= new Node();
        newnode.data=value;
        newnode.next=null;
        if(head == null){
            head= newnode;
            temp=newnode;
            return;
        }
        temp.next=newnode;
        temp=newnode;
    }
    public void deletion_Last(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head=null;
            temp=null;
            return;
        }
        Node ptr=head;
        while(ptr.next.next != null){
            ptr=ptr.next;
        }
        ptr.next=null;
        temp=ptr;
    }
    public void display(){
        Node ptr=head;
        while(ptr != null){
            System.out.print(ptr.data+"   ");
            ptr=ptr.next;
        }
        System.out.println();
    }

}
public class Main {
    public static void main(String[] args) {
        List L1=new List();
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
