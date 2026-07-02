import java.util.Scanner;
public class FibnacciRecursion {
    public static void fib(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c=a+b;
        System.out.print(c+"  ");
        fib(b, c, n-1);
    }
    public static void main(String[] args) {
        int value;
        int a=0;
        int b=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        value=sc.nextInt();
        System.out.print(a+"  "+b+"  ");
        fib(a, b, value-2);
        sc.close();
    }
}
