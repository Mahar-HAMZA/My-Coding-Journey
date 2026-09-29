class Heap{
    private int[] heap;

    public Heap(int[] heap){
        this.heap=heap;
    }

    public void heapifyDown(){
        int current=0;
        int left;
        int right;
        int large;

        while(true){
            left=(2*current)+1;
            right=(2*current)+2;
            if(left >= heap.length){
                return;
            }
            else if(right >= heap.length){
                if(heap[left] > heap[current]){
                    int temp=heap[current];
                    heap[current]=heap[left];
                    heap[left]=temp;
                    return;
                }
                else{
                    return;
                }
            }
            else if(heap[current] >= heap[left] && heap[current] >= heap[right]){
                return;
            }
            else if(heap[current] <  heap[left] && heap[left] >= heap[right]){
                int temp=heap[current];
                heap[current]=heap[left];
                heap[left]=temp;
                current=left;
                left=current*2+1;
                right=current*2+2;
            }
            else if(heap[current] <  heap[right] && heap[right] >= heap[left]){
                int temp=heap[current];
                heap[current]=heap[right];
                heap[right]=temp;
                current=right;
                left=current*2+1;
                right=current*2+2;
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
        int[] arr={10, 50, 40, 30, 20, 35, 45}; //{10, 30, 50, 20, 25, 40, 45};
        Heap heap = new Heap(arr);
        heap.heapifyDown();
        heap.printHeap();  // 50,30,40,10,20,35,45
    }
}