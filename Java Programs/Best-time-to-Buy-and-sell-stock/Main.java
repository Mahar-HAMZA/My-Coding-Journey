public class Main{
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};

        int profit=0;
        int first=arr[0];
        int newProfit=0;

        for(int i=1; i < arr.length; i++){
            if(first > arr[i]){
                first=arr[i];
            }
            else if(first < arr[i]){
                newProfit=arr[i]-first;
                if(profit < newProfit){
                    profit=newProfit;
                }
            }
        }
        System.out.println(profit);

    }
}
