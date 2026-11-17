import java.util.Scanner;
class Node{
    public int rollNo;
    public Node node;

    public Node(int rollNo, Node node){
        this.rollNo = rollNo;
        this.node = node;
    }
}
class List {
    private Node head;
    private Node temp;

    Scanner sc = new Scanner(System.in);

    public void insertEnd() {
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        Node newNode = new Node(rollNo, null);
        if (head == null) {
            head = newNode;
            temp = newNode;
            return;
        }
        temp.node = newNode;
        temp = newNode;
    }

    public Node Middle(){
        if(head == null){
            System.out.println("List is empty!");
            return null;
        }
        int count=0;
        Node prevNode=head;
        while(prevNode != null){
            count++;
            prevNode=prevNode.node;
        }
        count=count/2;
        prevNode=head;
        for(int i=0; i<count; i++){
            prevNode=prevNode.node;
        }
        return prevNode;
    }

}
public class Main{
    public static void main(String[] args) {
        List list1=new List();
        list1.insertEnd();
        list1.insertEnd();
        list1.insertEnd();
        list1.insertEnd();
        list1.insertEnd();
        list1.insertEnd();
        Node NewNode=list1.Middle();
        System.out.println("Middle: "+NewNode.rollNo);
    }
}