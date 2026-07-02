import java.util.Scanner;
class Node{
    public int data;
    public Node next;

}
class List{
    private Node head=null;
    private Node temp=null;

    Scanner sc= new Scanner(System.in);
    public void input(){
        int value;

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
    public void insert_Specific(){
        int pos, value;
        System.out.print("Enter position: ");
        pos=sc.nextInt();
        System.out.print("Enter value: ");
        value=sc.nextInt();
        Node newnode=new Node();
        newnode.data=value;
        newnode.next=null;
        if(head == null){
            head=newnode;
            temp=newnode;
            return;
        }
        if(pos == 1){
            newnode.next=head;
            head=newnode;
            return;
        }
        Node ptr=head;
        for(int i=1; i<pos-1 && ptr != null; i++){
            ptr=ptr.next;
        }
        if(ptr == null){
            System.out.println("Invalid Position!");
            return;
        }
        if(ptr.next == null){
            temp.next=newnode;
            temp=newnode;
            return;
        }
        newnode.next=ptr.next;
        ptr.next=newnode;
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
        L1.display();
        L1.insert_Specific();
        L1.display();
        L1.insert_Specific();
        L1.display();
    }
}
