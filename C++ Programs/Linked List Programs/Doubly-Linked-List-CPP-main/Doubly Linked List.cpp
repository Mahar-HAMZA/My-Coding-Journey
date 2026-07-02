#include<iostream>
using namespace std;
class Node{
	public:
		Node* next;
		int data;
		Node* prev;
		
};
class DoublyList{
	private:
		Node* head=NULL;
		Node* temp=NULL;
		public:
			void input(){
				int value;
				cout<<"Enter value: ";
				cin>>value;
				Node* newnode= new Node();
				newnode->prev=NULL;
				newnode->data=value;
				newnode->next=NULL;
				if(head == NULL){
					head=newnode;
					temp=newnode;
					return;
				}
				temp->next=newnode;
				newnode->prev=temp;
				temp=newnode;
			}
			void Insertion_Start(){
				int value;
				cout<<"Enter value: ";
				cin>>value;
				Node* newnode= new Node();
				newnode->prev=NULL;
				newnode->data=value;
				newnode->next=NULL;
				if(head == NULL){
					head=newnode;
					temp=newnode;
					return;
				}
				head->prev=newnode;
				newnode->next=head;
				head=newnode;
			}
			void Insertion_Specific(){
				int pos, value;
				cout<<"Enter position: ";
				cin>>pos;
				cout<<"Enter value: ";
				cin>>value;
				Node* newnode=new Node();
				newnode->prev=NULL;
				newnode->data=value;
				newnode->next=NULL;
				if(head == NULL){
					head=newnode;
					temp=newnode;
					return;
				}
				if(pos == 1){
					head->prev=newnode;
					newnode->next=head;
					head=newnode;
					return;
				}
				Node* temptr=head;
				for(int i=1; i<pos && temptr != NULL; i++){
					temptr=temptr->next;
				}
				if(temptr == NULL){
					temp->next=newnode;
					newnode->prev=temp;
					temp=newnode;
					return;
				}
				Node* prevNode = temptr->prev;
				newnode->next = temptr;
				newnode->prev = prevNode;
				prevNode->next = newnode;
				temptr->prev = newnode;

			}
			void deletion_Start(){
				if(head == NULL){
					cout<<"List is Empty!"<<endl;
					return;
				}
				if(head->next == NULL){
					delete head;
					head=NULL;
					temp=NULL;
					return;
				}
				Node* delptr=head;
				head->next->prev=NULL;
				head=head->next;
				delete delptr;
			}
			void deletion_Last(){
				if(head == NULL){
					cout<<"List is Emtpy!"<<endl;
					return;
				}
				Node* delptr=head;
				while(delptr->next != NULL){
					delptr=delptr->next;
				}
				delptr->prev->next=NULL;
				temp=delptr->prev;
				delete delptr;
			}
			void deletion_Specific(){
				Node* delptr=head;
				int pos;
				cout<<"Enter position: ";
				cin>>pos;
				if(head == NULL){
					cout<<"List is Empty!"<<endl;
					return;
				}
				if(head->next == NULL){
					delete head;
					head=NULL;
					temp=NULL;
					return;
				}
				if(pos == 1){
					head=head->next;
					delete delptr;
					return;
				}
				for(int i=1; i<pos && delptr != NULL; i++){
					delptr=delptr->next;
				}
				if(delptr->next == NULL){
					deletion_Last();
					return;
				}
				delptr->prev->next= delptr->next;
				delptr->next->prev=delptr->prev;
				delete delptr;
			}
			void display(){
				Node* ptr=head;
				while(ptr != NULL){
					cout<<ptr->data<<"	";
					ptr= ptr->next;
				}
				cout<<endl;
			}
};
int main()
{
	int choice;
	DoublyList D1;
	do{
		cout<<"1. Insertion At Last"<<endl;
		cout<<"2. Insertion At Start"<<endl;
		cout<<"3. Insertion At Specific"<<endl;
		cout<<"4. Deletion At Start"<<endl;
		cout<<"5. Deletion At Last"<<endl;
		cout<<"6. Deletion At Specific"<<endl;
		cout<<"7. Display List"<<endl;
		cout<<"8. Exit"<<endl;
		cout<<"Enter his choice: ";
		cin>>choice;
		switch(choice){
			case 1:
				D1.input();
				break;
				case 2:
					D1.Insertion_Start();
					break;
					case 3:
						D1.Insertion_Specific();
						break;
						case 4:
							D1.deletion_Start();
							break;
							case 5:
								D1.deletion_Last();
								break;
								case 6:
									D1.deletion_Specific();
									break;
				case 7:
					D1.display();
					break;
					case 8:
						exit(0);
						default:
							cout<<"You entered wronng choice!"<<endl;
		}
	} while(true);
}
