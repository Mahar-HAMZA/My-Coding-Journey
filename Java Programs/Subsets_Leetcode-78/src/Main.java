import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void subSets(int arr[], int index, List<Integer> ans, List<List<Integer>> finalList){
        if(index == arr.length){
            finalList.add(new ArrayList<>(ans));
            return;
        }

        int value=arr[index];

        subSets(arr, index+1, ans, finalList);
        ans.add(value);
        subSets(arr, index+1, ans, finalList);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> finalList=new ArrayList<>();
        subSets(arr, 0, ans, finalList);

        System.out.println(finalList);
    }
}