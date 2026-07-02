import java.util.Scanner;
class Arr{
    private int arr[]= new int[10];
    int count=-1;
    public void insertion_Last(){
        count++;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Element: ");
        arr[count]=sc.nextInt();
        System.out.println("Entered Successfully");
        
    }
    public void insertion_Start(){
        count++;
        int temp=arr[0];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Element: ");
        arr[0]=sc.nextInt();
        for(int i=1; i <= count; i++){
            int next = arr[i];
            arr[i] = temp;
            temp=next;
        }
    }
    void At_Specific(){
        count++;
        int next;
        Scanner sc= new Scanner(System.in);
        int pos;
        System.out.print("Enter position: ");
        pos= sc.nextInt();
        int temp=arr[pos];
        System.out.print("Enter Element: ");
        arr[pos]= sc.nextInt();
        if(pos == 0){
            for(int i=1; i <= count; i++){
            next = arr[i];
            arr[i] = temp;
            temp=next;
        }
        return;
        }
        if(pos == count){
            return;
        }
        else{
            for(int i=pos+1; i <= count; i++){
            next = arr[i];
            arr[i] = temp;
            temp=next;
            }
            return;
        }
    }
    public void deletion_Start(){
        for(int i=0; i <= count; i++){
            arr[i]=arr[i+1];
        }
        count--;
    }
    public void deletion_Last(){
        count--;
    }
    public void deletion_Specific(){
        Scanner sc= new Scanner(System.in);
        int pos;
        System.out.print("Enter Position: ");
        pos=sc.nextInt();
        if(pos == count){
            count--;
            return;
        }
        if(pos == 0){
            deletion_Start();
            return;
        }
        else{
            for(int i=pos; i <= count; i++){
                arr[i]=arr[i+1];
            }
            count--;
        }

    }
    public void display(){
        for(int i=0; i <= count; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
public class Array {
    public static void main(String[] args) {
        Arr a1= new Arr();
        Scanner sc= new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Insertion at Last");
            System.out.println("2. Insertion At Start");
            System.out.println("3. Insertion at Specific Point");
            System.out.println("4. Deletion at Last");
            System.out.println("5. Deletion at Start");
            System.out.println("6. Deletion at Start");
            System.out.println("7. Display Array");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice= sc.nextInt();
            switch(choice){
                case 1:
                    a1.insertion_Last();
                    break;
                    case 2:
                        a1.insertion_Start();
                        break;
                        case 3:
                            a1.At_Specific();
                            break;
                    case 4:
                        a1.deletion_Last();
                        break;
                        case 5:
                            a1.deletion_Start();
                            break;
                            case 6:
                                a1.deletion_Specific();
                                break;
                    case 7:
                    a1.display();
                    break;
                    case 8:
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Invalid Choice");
            }
        } while(true);
    }
}
