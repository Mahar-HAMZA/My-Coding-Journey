import java.util.Scanner;
class Node{
    public int data;
    public Node next;
}
class List{
    private Node top;
    public void insert(){
        int value;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value: ");
        value=sc.nextInt();
        Node newnode= new Node();
        newnode.data=value;
        newnode.next=top;
        top=newnode;
        System.out.println("Data Added Successfully!");
    }
    public void deletion(){
        if(top == null){
            System.out.println("Linked List is Free!");
            return;
        }
        System.out.println("value removed: "+top.data);
        top=top.next;
    }
    public void peek(){
        if(top == null){
            System.out.println("Linked List is Free!");
            return;
        }
        System.out.println("value on Top: "+top.data);
    }
    public void display(){
        Node temp=top;
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

}

public class StackLL {
    public static void main(String[] args) {
        List l1= new List();
        int choice;
        do{
            System.out.println("1. Insert\n2. Delete\n3. Peek\n4. Display\n5. Exit");
            System.out.print("Enter your choice: ");
            Scanner sc= new Scanner(System.in);
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    l1.insert();
                    break;
                case 2:
                    l1.deletion();
                    break;
                case 3:
                    l1.peek();
                    break;
                case 4:
                    l1.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (true);
    }
}
