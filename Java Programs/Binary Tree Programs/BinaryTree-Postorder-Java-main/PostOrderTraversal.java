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
    int idx;
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
    public void Traversal(Node root){
        if(root == null){
            return;
        }
        Traversal(root.left);
        Traversal(root.right);
        System.out.print(root.data+"    ");
    }
}
public class PostOrderTraversal{
    public static void main(String[] args) {
        binaryTree tree=new binaryTree();
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node root=tree.buildTree(arr,15);
        System.out.println("Tree build Successfully!");
        tree.Traversal(root);
        System.out.println();
        System.out.println("Tree display Successfully!");

    }
}