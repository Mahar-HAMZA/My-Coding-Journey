   // Linear Search with 1D Array in C++
#include<iostream>
using namespace std;
int main()
{
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
			cout<<"Element Found!"<<endl;
			cout<<"Index: "<<i;
			return 0;
		}
	}
	cout<<"Element Not Found!"<<endl;
}
