#include<iostream>
using namespace std;
class Array{
	public:
		void ArrSearch(int arr[3][3]){
			int search;
			cout<<endl<<"Enter element to search: ";
			cin>>search;
			for(int i=0; i <= 2; i++){
		for(int j=0; j <= 2; j++){
			if(search == arr[i][j]){
				cout<<"Element Found on Index "<<i<<j<<endl;
				cout<<"Element: "<<arr[i][j]<<endl;
				return;
			}
		}
	}
		}
};
int main()
{
	Array a1;
	int arr[3][3];
	for(int i=0; i <= 2; i++){
		for(int j=0; j <= 2; j++){
			cout<<"Enter Element: ";
			cin>>arr[i][j];
		}
	}
	
	for(int i=0; i <= 2; i++){
		for(int j=0; j <= 2; j++){
			cout<<arr[i][j]<<"	";
		}
		cout<<endl;
	}
	a1.ArrSearch(arr);
}
