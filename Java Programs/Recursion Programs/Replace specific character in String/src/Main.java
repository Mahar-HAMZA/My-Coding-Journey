public class Main{
    public static String replaceCharacter(String a, String b, int i, char ch, char change){
        if(i >= a.length()){
            return b;
        }
        if(a.charAt(i) != ch){
            char chr=a.charAt(i);
            b=b+chr;
        }
        else{
            char chr1=change;
            b=b+chr1;
        }
        return replaceCharacter(a, b, i+1, ch, change);
    }
    public static void main(String[] args) {
        String a="manage";
        String b="";
        char ch='a';
        char change='x';
        System.out.println(replaceCharacter(a, b, 0, ch, change));
    }
}