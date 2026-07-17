public class Main{
    public static int[] TwoSum(int arr[], int target){
        int left=0; int right=arr.length-1;
        int ans[]=new int[2];
        while(left < right){
            if(arr[left]+arr[right] == target){
                ans[0]=left+1;
                ans[1]=right+1;
                return ans;
            }
            else if(arr[left]+arr[right] > target){
                right--;
            }
            else{
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=13;
        int ans[]=TwoSum(arr, target);

        for(int i=0; i < ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}