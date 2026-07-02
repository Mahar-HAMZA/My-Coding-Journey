#include<iostream>
using namespace std;
class Arr{
	private:
		int arr[10];
		int next, temp;
		int count=-1;
	public:
		
		void insert_End(){
			count++;
			cout<<"Enter Element: ";
			cin>>arr[count];
			cout<<"Enter Element successfully!"<<endl;
		}
		void At_Specific(){
			count++;
			int pos;
			cout<<"Enter position: ";
			cin>>pos;
			int temp=arr[pos];
			cout<<"Enter Element: ";
			cin>>arr[pos];
			if(pos == count){
				return;
			}
			if(pos == 0){
				count++;
				for(int i=1; i <= count; i++){
				next=arr[i];
				arr[i]=temp;
				temp=next;
				
			}
			return;
		}
			else{
				for(int i=pos+1; i <= count; i++){
					int next=arr[i];
					arr[i]=temp;
					temp=next;
				}
			}
		}
		void insertion_Start(){
			count++;
			temp=arr[0];
			cout<<"Enter element: ";
			cin>>arr[0];
			for(int i=1; i <= count; i++){
				next=arr[i];
				arr[i]=temp;
				temp=next;
		}
	}
	void deletion_Start(){
		for(int i=0; i<= count; i++){
			arr[i]=arr[i+1];
		}
		count--;
	}
	void deletion_Last(){
		count--;
	}
	void Deletion_Specific(){
		int pos;
		cout<<"Enter position: ";
		cin>>pos;
		if(pos == count){
			count--;
			return;
		}
		if(pos == 0){
			deletion_Start();
			return;
		}
		else{
			for(int i=pos; i <= count; i++){
				arr[i]=arr[i+1];
			}
			count--;
		}
	}
		void Display(){
			cout<<"   Display Array   "<<endl;
			for(int i=0; i<= count; i++){
				cout<<"Value at Index "<<i<<": "<<arr[i]<<endl;
			}
			cout<<endl;
		}
};
int main()
{
	Arr a1;
	int choice;
	do{
		cout<<"1. Insertion At last"<<endl;
		cout<<"2. Insertion At Start"<<endl;
		cout<<"3. Insertion At Specific Point"<<endl;
		cout<<"4. Display Array"<<endl;
		cout<<"5. Deletion At last"<<endl;
		cout<<"6. Deletion At Start"<<endl;
		cout<<"7. Deletion At Specific Point"<<endl;
		cout<<"8. Exit"<<endl;
		cout<<"Enter his choice: ";
		cin>>choice;
		switch(choice){
			case 1:
				a1.insert_End();
				break;
				case 2:
					a1.insertion_Start();
					break;
					case 3:
						a1.At_Specific();
						break;
				case 4:
					a1.Display();
					break;
					case 5:
						a1.deletion_Last();
						break;
						case 6:
							a1.deletion_Start();
							break;
							case 7:
								a1.Deletion_Specific();
								break;
					case 8:
						exit(0);
						break;
					default:
						cout<<"Wrong Choice!"<<endl;
		}
	} while(true);
}
