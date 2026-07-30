public class Main{
    public static void generate(String str, int i, String ans) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(i);

        generate(str, i+1, ans);
        generate(str, i+1, ans+ch);
    }
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        generate(str, 0, ans);
    }
}