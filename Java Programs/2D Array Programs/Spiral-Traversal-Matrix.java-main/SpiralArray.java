import java.util.Scanner;
public class SpiralArray{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr= new int[3][3];
        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                System.out.print("Enter Element: ");
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0; i <= 2; i++){
            for(int j=0;  j <= 2; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        int top=0, bottom=2, left=0, right=2;
        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++){
                System.out.print(arr[left][i]+" ");
            }
            top++;
            for(int i=top; i<=bottom; i++){
                System.out.print(arr[i][bottom]+" ");
            }
            right--;
            if(left <= right){
                for(int i=right; i>=left; i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            if(top <= bottom){
                for(int i=bottom; i>= top; i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }
}
