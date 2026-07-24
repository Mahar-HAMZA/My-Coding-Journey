public class Main{
    public static void ReverseString(String name, int index){
        if(index < 0){
            return;
        }
        ReverseString(name, index-1);
        System.out.print(name.charAt(index));
    }

    public static void main(String[] args) {
        String name = "hamza";
        ReverseString(name, name.length()-1);
    }
}