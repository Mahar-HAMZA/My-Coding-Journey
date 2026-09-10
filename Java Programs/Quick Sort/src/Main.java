public class Main{
    public static void QuickSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int pivot=arr[start];
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=pivot;
        int i=start-1;
        int j=start;

        while(j < end){
            if(arr[j] <= pivot){
                i++;
                int temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
                j++;
            }
            else{
                j++;
            }
        }
        temp=arr[i+1];
        arr[i+1]=pivot;
        arr[end]=temp;

        QuickSort(arr,start,i);

        QuickSort(arr,i+2,end);

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        QuickSort(arr, 0, arr.length-1);

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
    }
}