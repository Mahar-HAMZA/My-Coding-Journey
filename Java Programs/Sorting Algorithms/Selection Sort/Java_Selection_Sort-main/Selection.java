import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter value of N: ");
        n=sc.nextInt();
        int [] arr= new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter element: ");
            arr[i]=sc.nextInt();
        }
        // Selection Sort Logic
        for(int i=0; i<n; i++){
            int smallest=i;
            for(int j=i+1; j<n; j++){
                if(arr[smallest] > arr[j]){
                    smallest=j;
                }
            }
            int temp= arr[smallest];
            arr[smallest]= arr[i];
            arr[i]= temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
