public class Main{
    public static void MoveZero(int arr[]){
        int left=0, right=1, temp;
        while(left <= right && right < arr.length){
            if(arr[left] == 0 && arr[right] != 0){
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right++;
            }
            else if(arr[left] != 0){
                left++;
                right++;
            }
            else{
                right++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 2, 3,4}; //{7,5,0,1,0,2,0,1,0} {0,1,0,3,12};
        MoveZero(arr);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}