import java.util.Scanner;

public class InsertPositon {
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
        int low=0, high=n-1, search, mid;
        System.out.print("Enter Element to search: ");
        search= sc.nextInt();
        while(low <= high){
            mid=(low+high)/2;
            if(search == arr[mid]){
                System.out.println("Element Found!");
                System.out.println("Index: "+mid);
                System.out.println("Element: "+arr[mid]);
                System.exit(0);
            }
            else if(search > arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        if(!found){
            System.out.println("Element Not Found!");
            System.out.println("Element Insert on Index: "+low);
        }
    }
}
