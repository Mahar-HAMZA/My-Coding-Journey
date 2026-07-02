import javax.swing.*;
import java.util.HashMap;
public class Main{
    public static void main(String[] args) {
        int arr[]={2,15,11,7};
        int n=4;
        int target=9;
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0; i < n; i++){
//            int current=arr[i];
            int need=target-arr[i];

            if(map.containsKey(need)){
                System.out.println(map.get(need)+" "+i);
                break;
            }
            map.put(arr[i], i);
        }
    }
}
