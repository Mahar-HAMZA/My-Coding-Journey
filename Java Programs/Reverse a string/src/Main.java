public class Main{
    public static void ReverseStr(char arr[]){
        int left=0, right=arr.length-1;
        while(left < right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char arr[]={'h','e','l','l','o','w'};
        ReverseStr(arr);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
    }
}