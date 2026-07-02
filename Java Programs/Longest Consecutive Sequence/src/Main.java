import java.util.HashSet;
public class Main{
    public static void main(String[] args) {

        int arr[]={10,5,31,3,55,30,4,11,2};
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        int newCount=0;

        for(int i=0; i < arr.length; i++){
            set.add(arr[i]);
        }

        for(int i=0; i < arr.length; i++){
            int current=arr[i];
           if(!set.contains(current-1)){
               while(set.contains(current+newCount)){
                   newCount++;
               }
           }
           if(newCount > count){
               count=newCount;
               newCount=0;
           }
           else{
               newCount=0;
           }
        }

        System.out.println("Count: "+count);
    }
}