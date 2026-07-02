import java.util.*;
public class Main {
    public static void main(String[] args) {
        int arr[]={1, 1, 1,3,3, 2, 2, 3,3};
        int k=2;

        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        List<Map.Entry<Integer, Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        for(int i=0; i < k; i++){
            System.out.println(list.get(i).getKey());
        }

    }
}