import java.util.*;
public class Main{
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String, List<String>> map=new HashMap<>();

        for(String words: arr){

            char[] chars=words.toCharArray();
            Arrays.sort(chars);

            String SortedWord=new String(chars);
            if(!map.containsKey(SortedWord)){
                map.put(SortedWord, new ArrayList<>());
            }
            map.get(SortedWord).add(words);
        }
        for(List<String> groups : map.values()){
            System.out.println(groups);
        }

    }
}