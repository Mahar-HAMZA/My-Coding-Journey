import java.util.Scanner;
public class Bubble{
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

        // Bubble Sort Logic
        for(int i=0; i<n; i++){
            for(int j=0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+"   ");
        }
    }
}
