import java.util.Scanner;
class Sum{
    public void SumAll(int arr[][]){
        int sum=0;
        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of all elements: "+sum);

    }
}

public class SumMat {
    static Sum s= new Sum();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [3][3];
        for(int i=0; i <= 2; i++){
            for(int j=0; j <= 2; j++){
                System.out.print("Enter Element: ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        s.SumAll(arr);
    }
}
