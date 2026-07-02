import java.util.Scanner;
public class SumOfN {
    public static void sum(int sum, int n){
        if(n == 0){
            System.out.print("Sum: " + sum);
            return;
        }
        sum+=n;
        sum(sum, n-1);
    }
    public static void main(String[] args) {
        int value;
        Scanner sc= new Scanner(System.in);
        System.out.print("Etner value of N: ");
        value=sc.nextInt();
        sum(0, value);
        sc.close();
    }
}
