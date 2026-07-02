import java.util.LinkedList;
import java.util.Queue;
class Node{
    public int data;
    public Node left;
    public Node right;

    Node(int value){
        data=value;
        left=null;
        right=null;

    }
}
class binaryTree{
    private int idx;

    binaryTree(){
        idx=-1;
    }
    public Node buildTree(int arr[], int size){
        idx++;
        if(idx>=size || arr[idx]==-1){
                return null;
        }
        Node newnode=new Node(arr[idx]);

        newnode.left=buildTree(arr, size);
        newnode.right=buildTree(arr,size);

        return newnode;
    }
    public void Traversing(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            for(int i=0; i<levelSize; i++){
                Node current=q.peek();
                q.remove();
                System.out.print(current.data+" ");
                if(current.right != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }
            System.out.println();
        }
    }
}
public class LineWiseTraversal{
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildTree(arr, 15);
        System.out.println("Tree Build Successfully!");
        tree.Traversing(root);
        System.out.println("Tree Level wise Order Display Successfully!");
    }
}