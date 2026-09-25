class Heap{
    private int[] heap;

    public Heap(int[] heap){
        this.heap=heap;
    }

    public void insertElement(int data){
        int newHeap[]=new int[heap.length+1];
        for(int i=0; i < heap.length; i++){
            newHeap[i]=heap[i];
        }
        newHeap[heap.length]=data;
        heap=newHeap;

        int current=heap.length-1;
        int parent=(current-1)/2;

        while(heap[current] > heap[parent] && current > 0){
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
        int arr[] = {30, 20, 25, 10, 18, 22, 15};
        Heap heap = new Heap(arr);
        heap.insertElement(35);
        heap.printHeap();  // 35 30 25 20 18 22 15 10
    }
}