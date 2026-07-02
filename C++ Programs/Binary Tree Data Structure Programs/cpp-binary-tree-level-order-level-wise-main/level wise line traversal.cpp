#include<iostream>
#include<queue>
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
			void LevelOrderTraversal(Node* root){
				if(root == NULL){
					return;
				}
				queue<Node*> q;
				q.push(root);
				
				while(!q.empty()){
					int levelWise=q.size();
					for(int i=0; i<levelWise; i++){
						Node* current=q.front();
						q.pop();
						
						cout<<current->data<<"	";
						
						if(current->left != NULL){
							q.push(current->left);
						}
						if(current->right != NULL){
							q.push(current->right);
						}
					}
					cout<<endl;
				}
			}
};
int main()
{
	int arr[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
	binaryTree tree;
	Node* root=tree.buildTree(arr, 15);
	cout<<"Tree build Successfully!"<<endl;
	tree.LevelOrderTraversal(root);
	cout<<endl<<"Tree Successfully display with level order Traversal!"<<endl;
}
