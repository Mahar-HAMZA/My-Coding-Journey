#include<iostream>
using namespace std;
int main()
{
	bool isTrue=false;
	int arr[5];
	for(int i=0; i<=4; i++){
		cout<<"Enter Element: ";
		cin>>arr[i];
	}
	
	int search;
	cout<<"Enter value to search: ";
	cin>>search;
	for(int i=0; i<=4; i++){
		if(search == arr[i]){
			cout<<"Value on Index: "<<i<<endl;
			isTrue=true;
		}
	}
	if(isTrue){
		return 0;
	}
	else
	cout<<"Element Not Found!"<<endl;
}
