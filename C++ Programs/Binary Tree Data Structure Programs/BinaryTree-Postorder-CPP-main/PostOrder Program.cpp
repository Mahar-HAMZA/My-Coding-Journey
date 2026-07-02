#include<iostream>
using namespace std;
class Node{
	public:
		int data;
		Node* left;
		Node* right;
		
		Node(int value){
			data=value;
			left=NULL;
			right=NULL;
		}
};
class binaryTree{
	private:
		int idx;
		public:
			binaryTree(){
				idx=-1;
			}
			Node* buildTree(int arr[], int size){
				idx++;
				if(idx>=size || arr[idx]==-1){
					return NULL;
				}
				Node* newnode=new Node(arr[idx]);
				newnode->left=buildTree(arr, size);
				newnode->right=buildTree(arr, size);
				
				return newnode;
			}
			void Traversal(Node* root){
				if(root == NULL){
					return;
				}
				Traversal(root->left);
				Traversal(root->right);
				cout<<root->data<<"	";
			}
};
int main()
{
	int arr[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
	binaryTree tree;
	Node* root=tree.buildTree(arr, 15);
	cout<<"Tree build Successfully!"<<endl;
	tree.Traversal(root);
	cout<<endl<<"Tree Display Successfully!"<<endl;
}
