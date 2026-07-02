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
			void insert(){
				int value;
				cout<<"Enter value: ";
				cin>>value;
				Node* newnode= new Node();
				newnode->data=value;
				newnode->next=NULL;
				if(head == NULL){
					head= newnode;
					temp=newnode;
					return;
				}
				temp->next=newnode;
				temp=newnode;
			}
			void deletion(){
				if(head == NULL){
					cout<<"List is empty!"<<endl;
					return;
				}
				else{
					Node* delptr=head;
					head=head->next;
					delete delptr;
					if(head == NULL){
						temp= NULL;
					}
				}
				
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
	List l1;
	int choice;
	do{
		cout<<"1. Insert value"<<endl;
		cout<<"2. Delete value"<<endl;
		cout<<"3. Display List"<<endl;
		cout<<"4. Exit"<<endl;
		cout<<"Enter his choice: ";
		cin>>choice;
		switch(choice){
			case 1:
				l1.insert();
				break;
				case 2:
					l1.deletion();
					break;
					case 3:
						l1.display();
						break;
						case 4:
							cout<<"Exit..."<<endl;
							exit(0);
							default:
								cout<<"You entered wrong choice!"<<endl;
		}
	} while(true);
}
