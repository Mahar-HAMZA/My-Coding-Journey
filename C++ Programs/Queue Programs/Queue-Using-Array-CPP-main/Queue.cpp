#include<iostream>
using namespace std;
class Queue{
	private:
		int arr[5];
		int front=-1;
		int rear=-1;
		public:
		Queue(){
			front=0;
			rear=0;
		}
		void insert(){
			if(isFull()){
				cout<<"Queue is Full!"<<endl;
				return;
			}
			else{
				cout<<"Enter value:"; 
				cin>>arr[rear];
				rear++;
				cout<<"Data entered successfully!"<<endl;
			}
		}
		void deletion(){
			if(isEmpty()){
				cout<<"Stack is Free!"<<endl;
				front=-1;
				rear=-1;
				return;
			}
			else{
				cout<<"Data removed: "<<arr[front]<<endl;
				front++;
			}	
		}
		bool isFull(){
			return rear == 5;
		}
		bool isEmpty(){
			return front == rear;
		}
		void display(){
			if(isEmpty()){
				cout<<"Stack is Free!"<<endl;
				return;
			}
			else{
				for(int i=front; i <rear; i++){
					cout<<arr[i]<<"	";
				}
				cout<<endl;
			}
		}
};
int main()
{
	Queue q1;
	int choice;
	do{
		cout<<"1. Insert Data"<<endl;
		cout<<"2. Delete Data"<<endl;
		cout<<"3. Display Data"<<endl;
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
							exit(0);
							default:
								cout<<"You entered wrong choice!"<<endl;
		}
	} while(true);
}
