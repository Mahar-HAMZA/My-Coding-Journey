#include<iostream>
using namespace std;
class Que{
	private:
		int arr[5];
		int front=-1;
		int rear=-1;
		int size=5;
		public:
			bool isFull(){
				return (rear+1) % size == front;
			}
			bool isEmpty(){
				return front==-1;
			}
			void insert(){
				int value;
				if(isFull()){
					cout<<"Queue is Full!"<<endl;
					return;
				} else if(front == -1){
					front=rear=0;
				}
				else{
					rear=(rear +1) % size;
				}
				cout<<"Enter value: ";
				cin>>value;
				arr[rear]=value;
				cout<<"Data Added Successfully!"<<endl;
			}
			void deletion(){
				if(isEmpty()){
					cout<<"Queue is Empty!"<<endl;
					return;
				}
				if(front == rear){
					front=rear=-1;
					return;
				}
				cout<<"Data removed: "<<arr[front]<<endl;
				front=(front+1) % size;
			}
			void display(){
				if(isEmpty()){
					cout<<"Queue is Free!"<<endl;
					return;
				}
				int i=front;
				while(true){
					cout<<arr[i]<<"	"<<endl;
					if(i == rear){
						break;
					}
					i=(i+1) % size;
				}
			}
};
int main()
{
	int choice;
	Que q1;
	do{
		cout<<"1. Insert value"<<endl;
		cout<<"2. Delete value"<<endl;
		cout<<"3. Display Queue"<<endl;
		cout<<"4. Exit"<<endl;
		cout<<"Enter his choice: ";
		cin>>choice;
		switch(choice){
			case 1:
				q1.insert();
				break;
				case 2:
					q1.deletion();
					break;
					case 3:
						q1.display();
						break;
						case 4:
							cout<<"Exit.....";
							exit(0);
							default:
								cout<<"You entered wrong choie!"<<endl;
		}
	} while(true);
}
