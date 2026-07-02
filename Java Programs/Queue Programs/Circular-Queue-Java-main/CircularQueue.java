import java.util.Scanner;
class queue{
    int arr[]= new int[5];
    private int front=-1;
    private int rear=-1;
    private int size=5;
    queue(){
        front=0;
        rear=0;
    }
    public boolean isFull(){
        return (rear+1)% size == front;
    }
    public boolean isEmpty(){
        return front == rear;
    }
    public void enqueue(){
        int value;
        Scanner sc= new Scanner(System.in);
        if(isFull()){
            System.out.println("Queue is Full!");
            return;
        }
        else{
            System.out.print("Enter value: ");
            value=sc.nextInt();
            arr[rear] = value;
             rear=(rear+1) % size;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Free!");
            return;
        }
        System.out.println("Data removed: "+arr[front]);
        front = (front +1 ) % size;
    }
    public void Display(){
        if(isEmpty()){
            System.out.println("Queue is Free!");
            return;
        }
        else{
            int i=front;
            while(true){
                if(i == rear) {
                    System.out.println();
                    return;
                }
                System.out.println(arr[i]+" ");
                i=(i+1)%size;
        }
    }
    }
}
public class CircularQueue {
    public static void main(String[] args) {
        queue q1= new queue();
        do{
            Scanner sc= new Scanner(System.in);
            int choice;
            System.out.println("1. Insert value");
            System.out.println("2. Delete value");
            System.out.println("3. Display Queue");
            System.out.println("4. Exiting.....");
            System.out.print("Enter his choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    q1.enqueue();
                    break;
                    case 2:
                        q1.dequeue();
                        break;
                        case 3:
                            q1.Display();
                            break;
                            case 4:
                                System.exit(0);
                                default:
                                    System.out.println("You entered wrong choice!");
            }
        } while(true);
    }
}
