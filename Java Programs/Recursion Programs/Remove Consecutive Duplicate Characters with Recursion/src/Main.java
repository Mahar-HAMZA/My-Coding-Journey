public class Main{
    public static String removeConsecutive(String a, String b, int i){
        if(i >= a.length()-1){
            char ch=a.charAt(i);
            b=b+ch;
            return b;
        }
        if(a.charAt(i) != a.charAt(i+1)){
            char ch=a.charAt(i);
            b=b+ch;
        }
        return removeConsecutive(a,b,i+1);
    }
    public static void main(String[] args) {
        String a="aabbcc";
        String b="";
        System.out.println(removeConsecutive(a,b, 0));
    }
}