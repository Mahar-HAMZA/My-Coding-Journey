#include<iostream>
using namespace std;
int main()
{
	int arr[3][3];
	for(int i=0; i <= 2; i++){
		for(int j=0; j <= 2; j++){
			cout<<"Enter Element: ";
			cin>>arr[i][j];
		}
		cout<<endl;
	}
	
	for(int i=0; i <= 2; i++){
		for(int j=0; j <= 2; j++){
			cout<<arr[i][j]<<"	";
		}
		cout<<endl;
	}
	
	int top=0;
	int left=0;
	int bottom=2;
	int right=2;
	while(top <= bottom && left <= right){
		for(int i=left; i<=right; i++){
			cout<<arr[left][i]<<"	";
		}
		top++;
		for(int i=top; i <= bottom; i++){
			cout<<arr[i][bottom]<<"	";
		}
		right--;
		
		if(top <= bottom){
			for(int i=right; i>=left; i--){
				cout<<arr[bottom][i]<<"	";
			}
			bottom--;
		}
		if(left <= right){
			for(int i=bottom; i >= top; i--){
				cout<<arr[i][left]<<"	";
			}
			left++;
		}
	}
}
