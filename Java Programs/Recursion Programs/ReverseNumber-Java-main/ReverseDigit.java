import java.util.Scanner;
public class ReverseDigit {
    public static void Rever(int digit){
        if(digit == 0){
            return;
        }
        int reverse=digit % 10;
        System.out.print(reverse);
        int div=digit/10;
        Rever(div);
    }
    public static void main(String[] args) {
        int digit;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter digits: ");
        digit=sc.nextInt();
        Rever(digit);
        sc.close();
    }
}
