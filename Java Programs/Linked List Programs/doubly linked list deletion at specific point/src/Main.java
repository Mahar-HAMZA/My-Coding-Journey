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
    public void deletion_Specific(){
        int pos;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter position: ");
        pos=sc.nextInt();
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(pos == 1){
            if(head.next == null){
                head=null;
                temp=null;
                return;
            }
            head=head.next;
            head.prev=null;
            return;
        }
        Node delptr=head;
        for(int i=1;i<pos;i++){
            if(delptr.next == null){
                System.out.println("You entered Invalid Position!");
                return;
            }
            delptr=delptr.next;
        }
        if(delptr.next != null){
            delptr.next.prev=delptr.prev;
        } else {
            temp=delptr.prev;
        }
        if(delptr.prev != null){
            delptr.prev.next=delptr.next;
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
        L1.input();
        L1.display();
        L1.deletion_Specific();
        L1.display();
        L1.deletion_Specific();
    }
}