#include<iostream>
using namespace std;
int main()
{
	int n;
	cout<<"Enter value of N: ";
	cin>>n;
	int arr[n];
	for(int i=0; i < n; i++){
		cout<<"Enter element: ";
		cin>>arr[i];
	}
	
	for(int i=0; i < n; i++){
		for(int j=0; j< n-i-1; j++){
			if(arr[j] > arr[j+1]){
				swap(arr[j], arr[j+1]);
			}
		}
	}
	
	cout<<"Array Sorted Successsfully!"<<endl;
	for(int i=0; i<n; i++){
		cout<<arr[i]<<"	";
	}
}
