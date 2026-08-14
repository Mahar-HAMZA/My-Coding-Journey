import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void subsets(int arr[], int index, List<Integer> nums){
        if(index == arr.length){
            System.out.println(nums);
            return;
        }
        nums.add(arr[index]);
        subsets(arr, index, nums);
        nums.remove(nums.size()-1);
        subsets(arr, index+1, nums);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<Integer> nums=new ArrayList<>();
        subsets(arr, 0, nums);
    }
}



/*import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void permutation(int arr[], List<Integer> nums){
        if(nums.size() == arr.length){
            System.out.println(nums);
            return;
        }
        for(int i=0; i < arr.length; i++){
            if(!nums.contains(arr[i])){
                nums.add(arr[i]);
                permutation(arr, nums);
                nums.remove(nums.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<Integer> nums=new ArrayList<>();
        permutation(arr,nums);
    }
} */