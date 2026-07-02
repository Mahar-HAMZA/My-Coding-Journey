#include<iostream>
using namespace std;
class Node{
	public:
		int data;
		Node* next;
		
};
class List{
	private:
		Node* head=NULL;
		Node* temp=NULL;
		public:
			void input(){
				int value;
				cout<<"Enter value: ";
				cin>>value;
				Node* newnode= new Node();
				newnode->data=value;
				newnode->next=NULL;
				if(head == NULL){
					head=newnode;
					temp=newnode;
					return;
				}
				temp->next=newnode;
				temp=newnode;
			}
			void ar_Start(){
				int value;
				cout<<"Enter value: ";
				cin>>value;
				Node* newnode= new Node();
				newnode->data=value;
				newnode->next=NULL;
				if(head == NULL){
					head = newnode;
					temp=newnode;
					return;
				}
				newnode->next=head;
				head=newnode;
			}
			void at_Specific(){
				int pos, value;
				cout<<"Enter position: ";
				cin>>pos;
				cout<<"Enter value: ";
				cin>>value;
				Node* newnode= new Node();
				newnode->data=value;
				newnode->next=NULL;
				if(head == NULL){
					head=newnode;
					temp=newnode;
					return;
				}
				if(pos == 1){
					newnode->next=head;
					head=newnode;
					return;
				}
				if(pos <= 0){
					cout<<"You entered wrong positon!"<<endl;
					return;
				}
				else{
					Node* temptr=head;
					for(int i=1; i< pos-1 && temptr != NULL; i++){
						temptr=temptr->next;
					}
					if(temptr == NULL){
						cout<<"You entered wrong position!"<<endl;
						return;
					}
					if(temptr->next == NULL){
						temptr->next=newnode;
						temp=newnode;
						return;
					}
					newnode->next=temptr->next;
					temptr->next=newnode;
				}
			}
			void deletion_First(){
				if(head == NULL){
					cout<<"List is Free!"<<endl;
					return;
				}
				if(head->next== NULL){
					delete head;
					head = NULL;
					temp=NULL;
					return;
				}
				Node* delptr=head;
				head=head->next;
				delete delptr;
			}
			void At_Specific(){
				int pos;
				cout<<"Enter position: ";
				cin>>pos;
				Node* delptr=head;
				if(head == NULL){
					cout<<"List is free!"<<endl;
					return;
				}
				if(head->next == NULL){
					delete head;
					head = NULL;
					temp=NULL;
					return;
				}
				if(pos == 1){
					head=head->next;
					delete delptr;
					return;
				}
				if(pos <= 0){
					cout<<"You entered wrong position!"<<endl;
					return;
				}
				else{
					for(int i=1; i < pos-1 && delptr != NULL; i++){
						delptr=delptr->next;
					}
					if(delptr == NULL){
						cout<<"You enter wrong position!"<<endl;
						return;
					}
					if(delptr->next == NULL){
						delete delptr->next;
						delptr->next=NULL;
						temp=delptr;
						return;
					}
					Node* target= delptr->next;
					delptr->next=target->next;
					delete target;
				}
				
			}
			void deletion_Last(){
				if(head == NULL){
					cout<<"List is Free!"<<endl;
					return;
				}
				if(head->next == NULL){
					delete head;
					head=NULL;
					return;
				}
				Node* delptr=head;
				while(delptr->next->next != NULL){
					delptr=delptr->next;
				}
				delete delptr->next;
				delptr->next=NULL;
				temp=delptr;
			}
			void display(){
				Node* ptr=head;
				while(ptr != NULL){
					cout<<ptr->data<<"	";
					ptr=ptr->next;
				}
				cout<<endl;
			}
};
int main()
{
	int choice;
	List l1;
	do{
		cout<<"1. Insertion At Last"<<endl;
		cout<<"2. Insertion At Start"<<endl;
		cout<<"3. Insertion At Specific"<<endl;
		cout<<"4. Delete First"<<endl;
		cout<<"5. Deletion Last"<<endl;
		cout<<"6. Deletion At Specific"<<endl;
		cout<<"7. Display Node"<<endl;
		cout<<"8. Exit"<<endl;
		cout<<"Enter his choice: ";
		cin>>choice;
		switch(choice){
			case 1:
				l1.input();
				break;
				case 2:
					l1.ar_Start();
					break;
					case 3:
						l1.at_Specific();
						break;
						case 4:
							l1.deletion_First();
							break;
						case 5:
							l1.deletion_Last();
							break;
							case 6:
								l1.At_Specific();
								break;
								case 7:
									l1.display();
									break;
									case 8:
									cout<<"Exiting......."<<endl;
									exit(0);
									default:
									cout<<"You entered wrong choice!"<<endl;
		}
	} while(true);
}
