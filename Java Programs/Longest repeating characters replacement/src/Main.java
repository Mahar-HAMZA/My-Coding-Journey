public class Main{
    public static int characterReplacement(String s, int k){
        int freq[]=new int[26];
        int left=0, maxfrequent=0, maxlength=0;

        for(int right=0; right < s.length(); right++){
            freq[s.charAt(right) - 'A']++;
            maxfrequent=Math.max(maxfrequent, freq[s.charAt(right)- 'A']);

            while((right-left+1) - maxfrequent > k){
                freq[s.charAt(left)- 'A']--;
                left++;
            }
            maxlength=Math.max(maxlength, (right-left+1));
        }
        return maxlength;
    }
    public static void main(String[] args) {
        String s="AABAB";
        int answer=characterReplacement(s, 1);
        System.out.println("Answer: "+answer);
    }
}