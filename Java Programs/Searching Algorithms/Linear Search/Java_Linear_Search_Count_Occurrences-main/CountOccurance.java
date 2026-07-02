import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        int count=0;
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
                count++;
                found=true;
            }
        }
        if(found){
            System.out.println("Occurance: "+count);
        }
        else{
            System.out.println("Not Found!");
        }
    }
}
