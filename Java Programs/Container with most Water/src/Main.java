public class Main{
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int left=0, right=arr.length-1;
        int area, width=0, height=0;
        int newArea=0, move=0;

        while(left <= right){
            width=right-left;
            height=Math.min(arr[left], arr[right]);
            area=width * height;

            if(area > newArea){
                newArea=area;
                area=0;
            }
            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("Area: "+newArea);
    }
}