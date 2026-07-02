import java.util.Scanner;
public class FactorialRecursion{
    public static void fact(int fact, int n){
        if( n == 1){
            System.out.println("Factorial: " + fact);
            return;
        }
        fact=fact* n;
        fact(fact, n-1);
    }
    public static void main(String[] args) {
        int value;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value: ");
        value=sc.nextInt();
        fact(1, value);
        sc.close();
    }
}