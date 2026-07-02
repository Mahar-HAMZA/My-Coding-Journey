public class Main{
    public static void main(String[] args) {
        String s="babad";
        int start=0;
        int maxlength=1;

        for(int i=0; i < s.length(); i++){
            int left=i;
            int right=i;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                int currentlength=right-left+1;

                if(currentlength > maxlength){
                    maxlength=currentlength;
                    start=left;
                }
                left--;
                right++;
            }

            left=i;
            right=i+1;

            while(left >= 0 && right < s.length() && s.charAt(left)== s.charAt(right)){
                int currentlength=right-left+1;

                if(currentlength > maxlength){
                    maxlength=currentlength;
                    start=left;
                }
                left--;
                right++;
            }
        }
        String answer=s.substring(start, start+maxlength);

        System.out.println("Longest palindromic substring: "+answer);
        System.out.println("Length: "+maxlength);
    }
}