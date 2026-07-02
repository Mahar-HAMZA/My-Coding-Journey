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
    }
    void deletion_Start(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head=null;
            temp=null;
            return;
        }
        head=head.next;
        head.prev=null;
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
        Node delptr=head;
        while(delptr.next != null){
            delptr=delptr.next;
        }
        delptr.prev.next=null;
        temp=delptr.prev;
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
public class DoublyList {
    public static void main(String[] args) {
        List L1=  new List();
        int choice;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("1. Insertion At Last");
            System.out.println("2. Insertion At First");
            System.out.println("3. Insertion At Specific Position");
            System.out.println("4. Deletion At First");
            System.out.println("5. Deletion At Last");
            System.out.println("6. Deletion At Specific Position");
            System.out.println("7. Display List");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    L1.input();
                    break;
                case 2:
                    L1.insertion_First();
                    break;
                case 3:
                    L1.insertion_Specific();
                    break;
                case 4:
                    L1.deletion_Start();
                    break;
                case 5:
                    L1.deletion_Last();
                    break;
                case 6:
                    L1.deletion_Specific();
                    break;
                    case 7:
                        L1.display();
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        } while(true);
    }
}
