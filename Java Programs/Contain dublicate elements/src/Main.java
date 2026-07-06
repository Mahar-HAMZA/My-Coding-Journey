import java.util.HashMap;
public class Main{
    public static boolean CountDublicate(int arr[]){
        HashMap<Integer, Integer> map=new HashMap<>();
        boolean isTrue=false;
        for(int i=0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(int i=0; i < arr.length; i++){
            if(map.get(arr[i]) > 1){
                isTrue=true;
                return isTrue;
            }
        }
        return isTrue;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        System.out.println(CountDublicate(arr));
    }
}