import java.util.Scanner;

public class OptimizeBubble {
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
        boolean alreadySorted= true;
        for(int i=0; i<n; i++){
            boolean swapped= false;
            for(int j=0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swapped= true;
                    alreadySorted=false;
                }
            }
            if(!swapped){
                break;
            }
        }

        if(!alreadySorted){
            System.out.println("Array Sorted Successfully!");
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+"   ");
            }
        }
        else{
            System.out.println("Array Already Sorted!");
        }
    }
}
