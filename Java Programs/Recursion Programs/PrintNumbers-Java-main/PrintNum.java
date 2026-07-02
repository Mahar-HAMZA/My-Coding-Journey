import java.util.Scanner;
public class PrintNum{
    public static void Print(int a, int n){
        if(a == n){
            System.out.print(a);
            return;
        }
        System.out.print(a+" ");
        Print(a+1, n);
    }
    public static void main(String[] args) {
        int value;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value: ");
        value=sc.nextInt();
        Print(1, value);
        sc.close();
    }
}