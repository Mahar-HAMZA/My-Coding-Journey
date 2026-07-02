import java.util.Scanner;
class Search{
    public void search(int low, int high, int search, int arr[]){
        if(low > high){
            System.out.println("Element Not Found!");
            return;
        }
        int mid= (low+high)/2;
        if(search == arr[mid]){
            System.out.println("Element Found!");
            System.out.println("Index: "+mid);
            System.out.println("Element: "+arr[mid]);
            return;
        }
        else if(search > arr[mid]){
            search(mid+1, high, search, arr);
        }
        else{
            search(low, mid-1, search, arr);
        }
    }
}

public class RecursiveBinary {
    public static void main(String[] args) {
        Search s1= new Search();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Value of N: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element: ");
            arr[i]=sc.nextInt();
        }

        int low=0, high=n-1, search;
        System.out.print("Enter element to search: ");
        search= sc.nextInt();
        s1.search(low, high, search, arr);
    }
}
