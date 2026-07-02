public class Main{
    public static int insertPosition(int arr[], int target){
        int low=0, high=arr.length-1;
        int mid=0;
        while(low <= high){
            mid=(low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7};
        int target=2;
        System.out.println("Answer: "+insertPosition(arr, target));
    }
}