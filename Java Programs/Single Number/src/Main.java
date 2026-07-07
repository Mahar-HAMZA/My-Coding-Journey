import java.util.HashMap;

public class Main{
    public static int singleElement(int arr[]){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(int i=0;  i < arr.length; i++){
            if(map.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        System.out.println(singleElement(arr));
    }
}