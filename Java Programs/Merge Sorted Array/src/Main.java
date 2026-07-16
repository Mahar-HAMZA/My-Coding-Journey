public class Main{
    public static void MergeArray(int arr1[], int m, int arr2[], int n){
        int left=m+n-1; int right=n-1;
        int current=m-1;
        while(current >= 0 && right >= 0){
            if(arr1[current] > arr2[right]){
                arr1[left]=arr1[current];
                left--;
                current--;
            }
            else if(arr1[current] < arr2[right]){
                arr1[left]=arr2[right];
                left--;
                right--;
            }
            else if(arr1[current] == arr2[right]){
                arr1[left]=arr2[right];
                left--;
                right--;
            }
        }

        while(right >= 0 && left >= 0){
            arr1[left]=arr2[right];
            right--;
            left--;
        }
    }  // 0 -1 0 0 1 1 1 2 3
    public static void main(String[] args) {
        int arr1[]={0,0,3,0,0,0,0,0,0};
        int m=3;
        int arr2[]={-1,1,1,1,2,3};
        int n=6;
        MergeArray(arr1, m, arr2, n);
        for(int i=0; i < arr1.length; i++){
            System.out.print(arr1[i]+"    ");
        }
        System.out.println("Hello World");
    }
}

/* nums1 = [1,2,3,0,0,0]
m = 3

nums2 = [2,5,6]
n = 3 */