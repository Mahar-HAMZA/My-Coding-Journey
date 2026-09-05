import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void CombinationSum(int candidates[], List<Integer> current, List<List<Integer>> result, int start, int sum, int target){
        if(sum == target){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = start; i < candidates.length; i++){
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if(sum < target){
                current.add(candidates[i]);
                sum=sum+candidates[i];
                CombinationSum(candidates, current, result, i+1, sum, target);
                int temp=current.get(current.size()-1);
                sum=sum-temp;
                current.remove(current.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int candidates[]={10,1,2,7,6,1,5};
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        Arrays.sort(candidates);

        CombinationSum(candidates,current,result,0,0,8);
        System.out.println(result);
    }
}