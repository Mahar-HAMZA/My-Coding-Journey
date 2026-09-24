class Heap{
    private int[] heap;

    public Heap(int[] heap){
        this.heap=heap;
    }

    public void createHeap(int data){
        int newHeap[]=new int[heap.length+1];

        for(int i=0;i<heap.length;i++){
            newHeap[i]=heap[i];
        }
        newHeap[newHeap.length-1]=data;
        heap=newHeap;

        int current=heap.length-1;
        int parent=(current-1)/2;

        while(heap[current] < heap[parent] & current > 0){
            int temp=heap[current];
            heap[current]=heap[parent];
            heap[parent]=temp;

            current=parent;
            parent=(current-1)/2;
        }

    }

    public void printHeap(){
        for(int i=0; i < heap.length; i++){
            System.out.print(heap[i]+"   ");
        }
        System.out.println();
    }

}
public class Main{
    public static void main(String[] args) {
        int arr[]={3,7,5,10,9,8,12};
        Heap heap=new Heap(arr);
        heap.createHeap(2);
        heap.printHeap();  // 2 3 5 7 9 8 12 10
    }
}