public class Main{
    public static void main(String[] args) {
        String name="madam";
        int left=0;
        int right=name.length()-1;

        while(left < right){
            if(name.charAt(left) == name.charAt(right)){
                left++;
                right--;
            }
            else{
                System.out.println("String is not palindrome!");
                return;
            }
        }
        System.out.println("String is palindrome!");
    }
}