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
            head=head.next;
            if(head == null){
                temp=null;
            }
            return;
        }
        Node ptr=head;
        for(int i=1; i<pos-1 && ptr != null; i++){
            ptr=ptr.next;
        }
        if(ptr == null || ptr.next == null){
            System.out.println("Position not found");
            return;
        }
        ptr.next=ptr.next.next;

        if(ptr.next == null){
            temp=ptr;
        }
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
        L1.input();
        L1.display();
        L1.deletion_Specific();
        L1.display();
        L1.deletion_Specific();
        L1.display();
    }
}
