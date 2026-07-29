public class Main{
    public static double helper(double x, long N){
        if(N == 0){
            return 1;
        }
        double half=helper(x, N/2);
        double result=half*half;
        if(N%2 != 0){
            return result*x;
        }
        return result;
    }
    public static double powerFunc(double x, int n){
        long N=n;
        if(N < 0){
            return 1.0/helper(x, -N);
        }
        return helper(x, N);
    }
    public static void main(String[] args) {
        double x=2;
        int n=-2;
        System.out.println(powerFunc(x, n));
    }
}