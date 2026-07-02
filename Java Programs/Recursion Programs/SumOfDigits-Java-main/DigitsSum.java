import java.util.Scanner;
public class DigitsSum {
    public static void DigSum(int digit, int sum){
        if(digit == 0){
            System.out.print("Sum: "+sum);
            return;
        }
        int reverse=digit % 10;
        sum+=reverse;
        int div= digit / 10;
        DigSum(div, sum);
    }
    public static void main(String[] args) {
        int digit;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value: ");
        digit=sc.nextInt();
        DigSum(digit, 0);
        sc.close();
    }
}
