#include<algorithm>
#include<iostream>
using namespace std;
int main()
{
	int n, search;
	bool found=false;
	cout<<"Enter Value of N: ";
	cin>>n;
	int arr[n];
	for(int i=0; i<n; i++){
		cout<<"Enter element: ";
		cin>>arr[i];
		
	}
	cout<<"Enter Element For Search: ";
	cin>>search;
	int low=0, high=n-1;
	int mid;
	sort(arr, arr+n);
	while(low <= high){
		mid= (low +high) / 2;
		if(search == arr[mid]){
			found=true;
			break;
		}
		else if(search >
		 arr[mid]){
			low=mid+1;
		}
		else{
			high=mid-1;
		}
	}
	if(found){
		cout<<"Element Found!"<<endl;
		cout<<"Index: "<<mid<<endl;
		cout<<"Element: "<<arr[mid]<<endl;
	}
	else{
		cout<<"Not Found!"<<endl;
	}
}
