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
            temp=newnode;
            return;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void insert_Specific(){
        int pos, value;
        Scanner sc= new Scanner(System.in);
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
        if(ptr.next == null){
            temp.next=newnode;
            temp=newnode;
            return;
        }
        newnode.next=ptr.next;
        ptr.next=newnode;
    }
    public void At_First(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void deletion_Last(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head=null;
            return;
        }
        Node ptr=head;
        while(ptr.next.next != null){
            ptr=ptr.next;
        }
        ptr.next=null;
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
public class SinglyList {
    public static void main(String[] args) {
        int choice;
        List L1= new List();
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("1. Insert At End");
            System.out.println("2. Insertion At Start");
            System.out.println("3. Insertion At Specific");
            System.out.println("4. Deletion At Last");
            System.out.println("5. Deletion At First");
            System.out.println("6. Deletion At Specific");
            System.out.println("7. Display List");
            System.out.println("8. Exit");
            System.out.print("Enter his choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    L1.input();
                    break;
                    case 2:
                        L1.insert_Start();
                        break;
                        case 3:
                            L1.insert_Specific();
                            break;
                            case 4:
                                L1.deletion_Last();
                                break;
                                case 5:
                                    L1.At_First();
                                    break;
                                    case 6:
                                        L1.deletion_Specific();
                                        break;
                    case 7:
                        L1.display();
                        break;
                        case 8:
                            System.exit(0);
                            default:
                                System.out.println("You entered wrong choice!");
            }
        } while(true);
    }
}
