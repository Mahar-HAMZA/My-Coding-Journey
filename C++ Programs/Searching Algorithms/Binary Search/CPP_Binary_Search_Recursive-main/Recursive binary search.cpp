#include<iostream>
using namespace std;
void Search(int low, int high, int search, int arr[]){
	if(low > high){
		cout<<"Element Not Found!"<<endl;
		return;
	}
	int mid=(low+high)/2;
	if(search == arr[mid]){
		cout<<"Element Found!"<<endl;
		cout<<"Index: "<<mid<<endl;
		cout<<"Element: "<<arr[mid]<<endl;
		return;
	}
	if(search > arr[mid]){
		Search(mid+1, high, search, arr);
	}
	else{
		Search(low, mid-1, search, arr);
	}
}
int main()
{
	int n, search;
	cout<<"Enter Value of N: ";
	cin>>n;
	int arr[n];
	for(int i=0; i<n; i++){
		cout<<"Enter element: ";
		cin>>arr[i];
	}
	cout<<"Enter value to search: ";
	cin>>search;
	int low=0, high=n-1;
	Search(low, high, search, arr);
}
