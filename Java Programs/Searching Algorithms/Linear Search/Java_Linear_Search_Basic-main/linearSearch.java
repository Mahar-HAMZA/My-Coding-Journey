import java.util.Scanner;
public class linearSearch {
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
        System.out.print("Enter element to Search: ");
        int search=sc.nextInt();
        for(int i=0; i<n; i++){
            if(search == arr[i]){
                System.out.println("Element Found!");
                System.out.println("Index: "+i);
                System.out.println("Element: "+arr[i]);
                found=true;
                System.exit(0);
            }
        }
        if(!found){
            System.out.println("Not found!");
        }
    }
}
