#include<iostream>
using namespace std;
class Array{
	public:
		void sumArr(int arr[3][3]){
			int sum=0;
			for(int i=0; i<=2; i++){
				for(int j=0; j<=2;  j++){
					sum+=arr[i][j];
				}
			}
			cout<<"Sum of All Matrixs: "<<sum<<endl;
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
		cout<<endl;
	}
	
	for(int i=0; i <= 2; i++){
		for(int j=0; j <= 2; j++){
			cout<<arr[i][j]<<"	";
		}
		cout<<endl;
	}
	a1.sumArr(arr);
}
