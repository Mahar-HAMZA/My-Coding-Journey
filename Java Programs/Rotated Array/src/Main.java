public class Main{
    // Optimal Approach : Time Complexity o(N);
    public static void RotateArray(int arr[], int Q){
        if(arr.length == 0){
            return;
        }
        Q=Q%arr.length;
        int left=0, right=arr.length-1;
        while(left < right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        left=0; right=Q-1;
        while(left < right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        left=Q;
        right=arr.length-1;
        while(left < right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    // Brute Froce Approach : Time Complexity o(N*K);
    public static void RotateArray(int arr[], int Q){
        if(arr.length == 0){
            return;
        }
        int k=Q % arr.length;
        while(k > 0){   //4  5  6  1  2  3  4
            int last=arr[arr.length-1];
            for(int i=arr.length-2; i >= 0; i--){
                if(i == 0){
                    arr[i+1]=arr[i];
                    arr[i]=last;
                }
                else{
                    arr[i+1]=arr[i];
                }
            }
            k--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=2;
        RotateArray(arr, k);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
    }
}