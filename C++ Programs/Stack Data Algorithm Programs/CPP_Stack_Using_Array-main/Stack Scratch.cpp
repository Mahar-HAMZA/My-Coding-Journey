#include<iostream>
using namespace std;
class Stack{
	private:
		int arr[5];
		int top=-1;
	public:
		void insert(){
			if(isFull()){
				cout<<"Stack is Full!"<<endl;
				return;
			}
			else{
			int value;
			cout<<"Enter value: ";
			cin>>value;
			top++;
			arr[top]= value;
			cout<<"Data entered in Stack successfully!"<<endl;
			}
		}
		void deletion(){
			if(top == -1){
				cout<<"Stack is Free!"<<endl;
			}
			else{
			top--;
			cout<<"Value Deleted Successfully!"<<endl;
		}
		}
		bool isFull(){
			if(top == 4){
				return true;
			}
			else{
				return false;
			}
		}
		void display(){
			if(top == -1){
				cout<<"Stack is Free!"<<endl;
				return;
			}
			else{
				for(int i=top; i>=0; i--){
					cout<<arr[i]<<"	";
				}
				cout<<endl;
			}
		}
		void peek(){
			if(top == -1){
				cout<<"Stack is Free!"<<endl;
			}
			else{
				cout<<"Data on top Index: "<<arr[top]<<endl;
			}
		}
		
};
int main()
{
	int choice;
	Stack s1;
	do{
		cout<<"1. Insert value in Stack"<<endl;
		cout<<"2. Delete value from Stack"<<endl;
		cout<<"3. Print top value"<<endl;
		cout<<"4. Display Stack"<<endl;
		cout<<"5. Exit"<<endl;
		cout<<"Enter choice: ";
		cin>>choice;
		switch(choice){
			case 1:
				s1.insert();
				break;
				case 2:
					s1.deletion();
					break;
					case 3:
						s1.peek();
						break;
						case 4:
							s1.display();
							break;
							case 5:
								exit(0);
								default:
									cout<<"You enter wrong choice!"<<endl;
				
		}
	} while(true);
}
