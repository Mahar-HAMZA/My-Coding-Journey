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

    void insertion_Specific(){
        int pos, value;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter position: ");
        pos=sc.nextInt();
        System.out.print("Enter value: ");
        value=sc.nextInt();
        Node newnode=new Node();
        newnode.data=value;
        newnode.next=null;
        newnode.prev=null;
        if(head == null){
            head=newnode;
            temp=newnode;
            return;
        }
        if(pos == 1){
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
            return;
        }
        Node temptr=head;
        for(int i=1;i<pos-1;i++){
            if(temptr.next == null){
                break;
            }
            temptr=temptr.next;
        }
        newnode.next=temptr.next;
        if(temptr.next != null){
            temptr.next.prev=newnode;
        }
        temptr.next=newnode;
        newnode.prev=temptr;
        if(newnode.next == null){
            temp=newnode;
        }
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
        L1.display();
        L1.insertion_Specific();
        L1.display();
        L1.insertion_Specific();
        L1.display();
    }
}