import java.util.HashMap;
public class Main{
    public static void main(String[] args) {
        String name1="listen";
        String name2="silent";
        boolean isTrue=false;
        HashMap<Character, Integer> map=new HashMap<>();

        if(name1.length() == name2.length()){
            for(int i=0; i < name1.length(); i++){
                if(map.containsKey(name1.charAt(i))){
                    map.put(name1.charAt(i),map.get(name1.charAt(i))+1);
                }
                else{
                    map.put(name1.charAt(i), 1);
                }
            }

            for(int i=0; i < name2.length(); i++){
               if(map.containsKey(name2.charAt(i))){
                   if(map.get(name2.charAt(i)) != 0) {
                       map.put(name2.charAt(i), map.get(name2.charAt(i)) - 1);
                       isTrue = true;
                   }
                   else{
                       System.out.println("String is not Valid Anagram!");
                       return;
                   }
               }
               else{
                   System.out.println("String is not Valid Anagram!");
                   return;
               }
            }
            if(isTrue){
                System.out.println("String is Valid Anagram!");
                return;
            }
        }
        System.out.println("String are not valid Anagram!");
    }
}