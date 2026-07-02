import java.util.HashSet;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int arr[] = {-2,0,0,2,2};
        int target=0;
        int left, right;
        Arrays.sort(arr);

        int sum=0;
        for(int i=0; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            left = i + 1;
            right = arr.length - 1;
            while (left < right) {
                sum=arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println(arr[i] + " " + arr[left] + "   " + arr[right]);
                    left++;
                    right--;
                    while(left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while(left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        System.out.println("Hello World");
    }
}
