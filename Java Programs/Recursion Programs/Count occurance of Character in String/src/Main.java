public class Main{
    public static int CountOccurance(String a, char ch, int i){
        if(i >= a.length()){
            return 0;
        }
        int count=CountOccurance(a, ch, i+1);
        if(a.charAt(i) == ch){
            count++;
        }

        return count;
    }
    public static int countOccurance(String a, char ch, int i, int count){
        if(i >= a.length()){
            return count;
        }
        if(a.charAt(i) == ch){
            count++;
        }
        return countOccurance(a, ch,i+1, count);
    }
    public static void main(String[] args) {
        String a="banana";
        int count=0;
        char ch='a';
        System.out.println(countOccurance(a, ch, 0, count));
        System.out.println(CountOccurance(a, ch, 0));
    }
}