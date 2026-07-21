public class Main{
    public static int fiboNumber(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fiboNumber(n-1)+fiboNumber(n-2);
    }
    public static void main(String[] args) {
        int n=-4;
        System.out.println(fiboNumber(n));
    }
}