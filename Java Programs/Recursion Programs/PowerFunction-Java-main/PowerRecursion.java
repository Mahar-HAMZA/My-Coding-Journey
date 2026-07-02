import java.util.Scanner;
public class PowerRecursion {
    public static void power(int num, int pow, int result){
        if(pow == 1){
            System.out.println(result);
            return;
        }
        result=result*num;
        power(num, pow-1, result);
    }
    public static void main(String[] args) {
        int value, pow;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value: ");
        value=sc.nextInt();
        System.out.print("Enter Power: ");
        pow=sc.nextInt();
        power(value, pow, value);
        sc.close();
    }
}
