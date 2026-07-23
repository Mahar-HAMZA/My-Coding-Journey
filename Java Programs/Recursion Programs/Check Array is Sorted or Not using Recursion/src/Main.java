public class Main{
    public static boolean ArrayCheck(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return ArrayCheck(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(ArrayCheck(arr, 0));
    }
}

