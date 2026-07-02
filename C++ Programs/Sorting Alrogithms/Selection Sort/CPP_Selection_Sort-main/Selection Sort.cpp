#include<iostream>
#include<algorithm>
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
	int smallest;
	for(int i=0; i< n; i++){
		smallest=i;
		for(int j=i+1; j<n; j++){
			if(arr[smallest] > arr[j]){
				smallest=j;
			}
		}
		swap(arr[smallest], arr[i]);
	}
	
	for(int i=0; i <n; i++){
		cout<<arr[i]<<"	";
	}
}
