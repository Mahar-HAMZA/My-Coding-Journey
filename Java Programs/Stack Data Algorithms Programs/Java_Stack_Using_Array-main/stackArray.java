import java.util.Scanner;
class stack{
    private int[] arr= new int[5];
    private int top=-1;
    
    public void insert(){
        if(isFull()){
            System.out.println("Stack is Full!");
            return;
        }
        else{
        int value;
        System.out.print("Enter value: ");
        Scanner sc = new Scanner(System.in);
        top++;
        arr[top]=sc.nextInt();
        System.out.println("Data enter in Stack successfully!");
        }
    }
        public void delet(){
            if(top == -1){
                System.out.println("Stack is Free!");
            }
            else{
            top--;
            System.out.println("Data removed from Stack successfully!");
            }
        }
        public boolean isFull(){
            return top == arr.length -1;
        }
        public void peek(){
            if(top == -1){
                System.out.println("Stack is Free!");
                return;
            }
            System.out.println("Value of Top index: "+arr[top]);
        }

        public void display(){
            if(top == -1){
                System.out.println("Stack is Free!");
                return;
            }
            for(int i=top; i >=0; i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    
}
public class stackArray{
    public static void main(String[] args) {
        int choice;
        stack s1= new stack();
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("1. Insert Data");
            System.out.println("2. Delete Data");
            System.out.println("3. Peek Data");
            System.out.println("4. Display Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice= sc.nextInt();
            switch(choice){
                case 1:
                    s1.insert();
                    break;
                    case 2:
                        s1.delet();
                        break;
                        case 3:
                            s1.peek();
                            break;
                            case 4:
                                s1.display();
                                break;
                                case 5:
                                    System.out.println("Exiting...");
                                    System.exit(0);
                                    break;
                                    default:
                                        System.out.println("Invalid Choice!");
            }
        } while(true);
    }
}