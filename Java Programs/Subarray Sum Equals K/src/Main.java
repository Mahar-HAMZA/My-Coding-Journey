import java.util.HashMap;
public class Main{
    public static void main(String[] args) {
        int arr[]={1,2,3,-2,5};

        int k=5, count=0, sum=0;
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0; i < arr.length; i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);

        }
        System.out.println("Count: "+count);

    }
}