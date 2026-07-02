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
	bool alreadySorted=true;
	
	// Optimize Bubble Sort logic
	for(int i=0; i < n; i++){
		bool swapped=false;
		for(int j=0; j < n-i-1; j++){
			if(arr[j] > arr[j+1]){
				swap(arr[j], arr[j+1]);
				swapped=true;
				alreadySorted=false;
			}
		}
		if(!swapped){
			break;
		}
	}
	
	if(!alreadySorted){
		cout<<"Array Sorted Successsfully!"<<endl;
	    for(int i=0; i<n; i++){
		cout<<arr[i]<<"	";
	}
	}
	else{
		cout<<"Array already Sorted!"<<endl;
	}
}
