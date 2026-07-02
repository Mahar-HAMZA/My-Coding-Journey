import java.util.HashMap;
public class Main{
    public static void main(String[] args) {
        String name="aabbcdef";

      HashMap<Character, Integer> map=new HashMap<>();

      for(int i=0; i < name.length(); i++){
          if(map.containsKey(name.charAt(i))){
              map.put(name.charAt(i), map.get(name.charAt(i))+1);
          }
          else{
              map.put(name.charAt(i), 1);
          }
      }

      for(int i=0; i < name.length(); i++){
          if(map.get(name.charAt(i)) == 1){
              System.out.println("First Non repeating character: "+name.charAt(i));
              return;
          }
      }



    }
}