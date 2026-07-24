public class Main{
    public static int LastOccurance(int arr[], int target, int index){
        if(index >= arr.length){
            return -1;
        }
        int ans=LastOccurance(arr, target, index+1);
        if(ans != -1){
            return ans;
        }
        if(arr[index] == target){
            return index;
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,3,8,3,9};
        int target=3;
        System.out.println(LastOccurance(arr, target, 0));
    }
}