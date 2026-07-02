import java.util.Scanner;

public class MultiOccurance {
    public static void main(String[] args) {
        boolean found=false;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Value of N: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to find Occurance: ");
        int search=sc.nextInt();
        for(int i=0; i<n; i++){
            if(search == arr[i]){
                System.out.println("Found on Index: "+i);
                found=true;
            }
        }
        if(!found){
            System.out.println("Not Found!");
        }
    }
}
