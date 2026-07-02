import java.util.HashSet;
public class Main{
    public static void main(String[] args) {
        String name="bcaeaf";
        int currentlength=0;
        int maxlength=0;
        int left=0;
        HashSet<Character> set=new HashSet<>();
        for(int right=0; right < name.length(); right++){

            while(set.contains(name.charAt(right))){
                set.remove(name.charAt(left));
                left++;
            }

            set.add(name.charAt(right));
            currentlength=right-left+1;

            if(currentlength > maxlength){
                maxlength=currentlength;
            }
        }

       System.out.println("Longest Substring without repeating characters: "+maxlength);
    }
}