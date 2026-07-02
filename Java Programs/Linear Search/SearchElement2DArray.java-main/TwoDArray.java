import java.util.Scanner;
public class TwoDArray{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello, 2D World!");
        int arr[][] = new int[3][3];
        for(int i=0; i <= 2; i++){
            for(int j=0; j <= 2; j++){
                System.out.print("Enter Element: ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter element to search: ");
        int search=sc.nextInt();
        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
               if(search == arr[i][j]){
                   System.out.println("Element found at position: ("+i+","+j+")");
                   System.out.println("Element: "+arr[i][j]);
               }
            }
            
        }
    }
}