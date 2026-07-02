import java.util.Scanner;
class Node{
    public int data;
    public Node next;

}
class List{
    private Node head=null;
    private Node temp=null;

    public void insert(){
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
            temp.next=newnode;
            temp=newnode;
        }
    }
    public void deletion(){
        if(head == null){
            System.out.println("List is Free!");
            return;
        }
        head=head.next;
        System.out.println("Node deleted successfully!");
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
public class ListQueue {
    public static void main(String[] args) {
        List l1= new List();
        do{
            Scanner sc= new Scanner(System.in);
            int choice;
            System.out.println("1. Insert Node");
            System.out.println("2. Delete Node");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print("Enter his choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    l1.insert();
                    break;
                    case 2:
                        l1.deletion();
                        break;
                        case 3:
                            l1.display();
                            break;
                            case 4:
                                System.out.println("Exiting......");
                                System.exit(0);
                                default:
                                    System.out.println("You entered wrong choice!");
            }
        } while(true);
    }
}
