public class Main{
    public static int firstOccurance(int arr[], int target, int index){
        if(index >= arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return firstOccurance(arr, target, index+1);
    }
    public static void main(String[] args) {
        int arr[]={5,3,8,4,9};
        int target=8;
        System.out.println(firstOccurance(arr, target, 0));
    }
}