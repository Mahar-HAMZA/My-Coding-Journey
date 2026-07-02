import java.util.Queue;
import java.util.LinkedList;
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
        newnode.right=buildTree(arr, size);

        return newnode;
    }
    public void Traversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node current=q.peek();
            q.remove();
            System.out.print(current.data+"   ");
            if(current.left!= null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);
            }
        }
    }
}
public class LevelOrderTraversal{
    public static void main(String[] args) {
        int arr[]={1,5,4,-1,-1,17,-1,-1,11,25,-1,-1,19,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildTree(arr, 15);
        System.out.println("Tree build Successfully!");
        tree.Traversal(root);
        System.out.println();
        System.out.println("Tree Level wise Display successfully!");
    }
}