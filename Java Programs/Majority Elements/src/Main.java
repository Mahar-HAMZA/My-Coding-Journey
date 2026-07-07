import java.util.HashMap;
public class Main{
    public static int majorityElement(int arr[]){
        int half=arr.length/2;
        int element=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0 ; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        int length=0;

        for(int i=0; i < arr.length; i++){
            if(map.get(arr[i]) > length){
                element=arr[i];
                length=map.get(arr[i]);
            }
        }
        if(length > half){
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}