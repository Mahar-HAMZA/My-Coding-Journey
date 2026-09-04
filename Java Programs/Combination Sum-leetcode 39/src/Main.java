import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void combinationSum(int candidates[], int target, List<Integer> current, List<List<Integer>> result, int start, int sum){
        if(sum == target){
            result.add(new ArrayList<>(current));
            return;
        }
        if(sum > target){
            return;
        }
        for(int i = start; i < candidates.length; i++){
                current.add(candidates[i]);
                sum=sum+candidates[i];
                combinationSum(candidates, target, current, result, i, sum);
                int temp=current.get(current.size()-1);
                current.remove(current.size()-1);
                sum=sum-temp;
        }
    }
    public static void main(String[] args) {
        int candidates[]={2,3,6,7};
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        int target=7;

        combinationSum(candidates, target, current, result, 0, 0);
        System.out.println(result);

    }
}