import java.util.Scanner;
class Sum{
    public void SumByRow(int arr[][]){
        int sum=0;
        for(int i=0; i<=2; i++){
            sum=0;
            for(int j=0; j<=2; j++){
                sum+=arr[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" : "+sum);
        }
    }
    public void SumByColumn(int arr[][]){
        int sum=0;
        for(int i=0; i<=2; i++){
            sum=0;
            for(int j=0; j<=2; j++){
                sum+=arr[j][i];
            }
            System.out.println("Sum of column "+(i+1)+" : "+sum);
        }
    }
}
public class RowSum {
    public static void main(String[] args) {
        Sum obj= new Sum();
        Scanner sc= new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i=0; i <= 2; i++){
            for(int j=0; j <= 2; j++){
                System.out.print("Enter Element: ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0; i <= 2; i++){
            for(int j=0; j <= 2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        obj.SumByRow(arr);
        obj.SumByColumn(arr);

    }
}
