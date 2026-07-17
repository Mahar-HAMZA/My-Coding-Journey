public class Main{
    public static void SquareArray(int arr1[], int arr2[]){
        int right=arr1.length-1; int left=arr2.length-1;
        int current=0;
        while(current <= right){
            if(arr1[current]*arr1[current] > arr1[right]*arr1[right]){
                arr2[left]=arr1[current]*arr1[current];
                current++;
                left--;
            }
            else if(arr1[current]*arr1[current] < arr1[right]*arr1[right]){
                arr2[left]=arr1[right]*arr1[right];
                right--;
                left--;
            }
            else if(arr1[current]*arr1[current] == arr1[right]*arr1[right]){
                arr2[left]=arr1[right]*arr1[right];
                right--;
                left--;
            }
        }
    }
    public static void main(String[] args) {
        int arr1[]={-3,-3,2};    //{-4,-1,0,3,10};
        int arr2[]=new int[3];

        SquareArray(arr1, arr2);
        for(int i=0; i < arr2.length; i++){
            System.out.print(arr2[i]+"    ");
        }
    }
}