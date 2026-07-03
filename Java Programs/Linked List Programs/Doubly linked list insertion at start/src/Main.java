import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node prev;

}
class List{
    private Node head = null;
    private Node temp = null;

    void insertion_First(){
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
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
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
        L1.insertion_First();
        L1.insertion_First();
        L1.insertion_First();
        L1.insertion_First();
        L1.insertion_First();
        L1.display();
        L1.insertion_First();
        L1.display();
    }
}