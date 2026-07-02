public class Main{
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        int count=0;
        int newCount=0;

        for(int i=0; i < arr.length; i++){
            if(arr[i] != 1){
                count=newCount;
                newCount=0;
            }
            else{
                newCount++;
                if(newCount > count){
                    count=newCount;
                }
            }

        }
        System.out.println(count);
    }
}
