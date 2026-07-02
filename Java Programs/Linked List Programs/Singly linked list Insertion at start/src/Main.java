import java.util.Scanner;
class Node{
    public int data;
    public Node next;

}
class List{
    private Node head=null;

    public void insert_Start(){
        int value;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value: ");
        value=sc.nextInt();
        Node newnode= new Node();
        newnode.data=value;
        newnode.next=null;
        if(head == null){
            head= newnode;
            return;
        }
        else{
            newnode.next=head;
            head=newnode;
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
        L1.insert_Start();
        L1.insert_Start();
        L1.insert_Start();
        L1.insert_Start();
        L1.display();
        L1.insert_Start();
        L1.display();
        L1.insert_Start();
        L1.display();
    }
}
