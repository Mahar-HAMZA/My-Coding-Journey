#include<iostream>
using namespace std;
class Node{
	public:
		int data;
		Node* next;
};
class List{
	private:
		Node* top=NULL;
		public:
			void insert(){
				int value;
				cout<<"Enter value: ";
				cin>>value;
				Node* newnode= new Node();
				newnode->data=value;
				newnode->next=top;
				top=newnode;
				cout<<"Value added Successfully!"<<endl;
		}
		void deletion(){
			if(top == NULL){
				cout<<"Stack Linked List is Free!"<<endl;
				return;
			}
			else{
				cout<<"value deleted: "<<top->data<<endl;
				top=top->next;
			}
		}
			void peek(){
				if(top == NULL){
					cout<<"Stack Linked List is Free!"<<endl;
					return;
				}
				else{
					cout<<"Value on Top Node: "<<top->data<<endl;
				}
			}
			void display(){
				Node* temp=top;
				while(temp != NULL){
					cout<<temp->data<<"	";
					temp=temp->next;
				}
				cout<<endl;
			}
		
};
int main()
{
	int choice;
	List l1;
	do{
		cout<<"1. Insert value"<<endl;
		cout<<"2. Delete value"<<endl;
		cout<<"3. Print top value"<<endl;
		cout<<"4. Display List"<<endl;
		cout<<"5. Exit"<<endl;
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
						l1.peek();
						break;
						case 4:
							l1.display();
							break;
							case 5:
								exit(0);
								default:
									cout<<"You entered wrong choice!"<<endl;
		}
	} while(true);
}
