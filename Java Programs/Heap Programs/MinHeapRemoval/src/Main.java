class Heap{
    private int[] heap;

    public Heap(int[] heap){
        this.heap=heap;
    }

    public void removeElement(){
        int temp=heap[0];
        heap[0]=heap[heap.length-1];
        heap[heap.length-1]=temp;
        int newHeap[]=new int[heap.length-1];
        for(int i=0; i < newHeap.length; i++){
            newHeap[i]=heap[i];
        }
        heap=newHeap;
        int current=0;

        int leftChild=2 * current+ 1;
        int rightChild=2 * current+ 2;
        int smallerChild;
        if(leftChild >= heap.length){
            return;
        }
        if(rightChild >= heap.length){
            smallerChild=leftChild;
        }
        else if(heap[leftChild] < heap[rightChild]){
            smallerChild=leftChild;
        }
        else{
            smallerChild=rightChild;
        }

        while(heap[current] > heap[smallerChild]){
            int temp1=heap[current];
            heap[current]=heap[smallerChild];
            heap[smallerChild]=temp1;

            current=smallerChild;

            leftChild=2 * current+ 1;
            rightChild=2 * current+ 2;
            if(leftChild>=heap.length){
                break;
            }
            else if(rightChild>=heap.length){
                smallerChild=leftChild;
            }
            else if(heap[leftChild] < heap[rightChild]){
                smallerChild=leftChild;
            }
            else{
                smallerChild=rightChild;
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
        int arr[]={3,7,5,10,9,8,12};
        Heap heap=new Heap(arr);
        heap.printHeap();  // 3 7 5 10 9 8 12
        heap.removeElement();
        heap.printHeap();  // 5 7 8 10 9 12
    }
}