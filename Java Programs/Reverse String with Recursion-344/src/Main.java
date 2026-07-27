public class Main{
    public static void reverseString(char arr[], int left, int right){
        if(left >= right){
            return;
        }
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseString(arr, left+1, right-1);
    }
    public static void main(String[] args) {
        char arr[]={'h','a','m','z','a'};
        reverseString(arr, 0, arr.length-1);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}