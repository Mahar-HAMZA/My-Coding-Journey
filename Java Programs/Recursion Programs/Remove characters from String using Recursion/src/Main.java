public class Main{
    public static String RemoveChar(String name1, String name2, char char1, int index){
        if(index >= name1.length()){
            return name2;
        }
        if(name1.charAt(index) != char1){
            char ch=name1.charAt(index);
            name2=name2+ch;
        }
        return RemoveChar(name1, name2, char1, index+1);
    }
    public static void main(String[] args) {
        String name1="banana";
        String name2="";
        char char1='a';

        System.out.println(RemoveChar(name1, name2, char1, 0));
    }
}