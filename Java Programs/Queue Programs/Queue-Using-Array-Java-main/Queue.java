import java.util.Scanner;
class Que{
    int[] arr= new int[5];
    private int front=-1;
    private int rear=-1;
    Que(){
        front=0;
    }
    public boolean isFull(){
        return rear == 5-1;
    }
    public boolean isEmpty(){
        return front == rear;
    }
    public void Enquue(){
        if(isFull()){
            System.out.println("Queue is Full!");
            return;
        }
        Scanner sc= new Scanner(System.in);
        int value;
        System.out.print("Enter value: ");
        value= sc.nextInt();
        arr[++rear]=value;
        System.out.println("value added successfully!");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Free!");
            return;
        }
        else{
            System.out.println("value removed: "+arr[front]);
            front++;
        }
    }
    public void Display(){
        for(int i=front; i<=rear; i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
    }
}
public class Queue {
    public static void main(String[] args) {
        Que q1= new Que();
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
                    q1.Enquue();
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
