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

    public void buildHeap(){
        int current, left, right, large;
        for(int i=(heap.length/2)-1; i >= 0; i--){
            current=i;
            left=i*2+1;
            right=i*2+2;
            while(left < heap.length) {
                if(left < heap.length && right >= heap.length){
                    if(heap[left] > heap[current]){
                        int temp=heap[current];
                        heap[current]=heap[left];
                        heap[left]=temp;
                    }
                    break;
                }
                if (heap[current] < heap[left] || heap[current] < heap[right]) {
                    if (heap[left] > heap[right]) {
                        large = left;
                    } else {
                        large = right;
                    }
                }
                else{
                    break;
                }
                if(heap[current] < heap[large]){
                    int temp=heap[current];
                    heap[current]=heap[large];
                    heap[large]=temp;
                    current=large;
                    left=current*2+1;
                    right=current*2+2;
                }
            }
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
        int[] arr={10, 30, 20, 5, 40, 15, 50};  //{50, 30, 10, 5, 20, 15};
        Heap heap = new Heap(arr);
        heap.buildHeap();
        heap.printHeap();  // 50   40   20   5   30   15   10
    }
}