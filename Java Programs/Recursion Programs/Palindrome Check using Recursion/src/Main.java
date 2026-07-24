public class Main{
    public static boolean PalimdromeCheck(String name, int left, int right){
        if(left >= right){
            return true;
        }

        if(name.charAt(left) != name.charAt(right)){
            return false;
        }

        return PalimdromeCheck(name, left+1, right-1);
    }

    public static void main(String[] args) {
        String name = "a";
        System.out.println(PalimdromeCheck(name, 0, name.length()-1));
    }
}