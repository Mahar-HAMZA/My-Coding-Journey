public class Main{
    public static int RemoveDublicate(int arr[]){
        int left=0, right=1;
        while(left <= right && right < arr.length){
            if(arr[left] != arr[right]){
                left++;
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right++;
            }
            else{
                right++;
            }

        }
        return left+1;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};  //{1,2,3,4,5};   //{1,1,2}
        System.out.println(RemoveDublicate(arr));
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}