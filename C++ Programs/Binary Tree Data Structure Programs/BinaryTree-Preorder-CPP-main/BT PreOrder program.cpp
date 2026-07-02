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
	public:
		int idx;
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
		void printTree(Node* root){
			if(root == NULL){
				return;
			}
			cout<<root->data<<"	";
			printTree(root->left);
			printTree(root->right);
			
		}
};
int main()
{
	int arr[] = {15,10,5,-1,-1,-1,25,20,-1,22,-1,-1,30,-1,-1};
	int size=15;
	binaryTree tree;
	Node* root=tree.buildTree(arr, size);
	cout<<"Tree build Successfully!"<<endl;
	tree.printTree(root);
	cout<<endl<<"Tree Displayed Successfully!"<<endl;
}
