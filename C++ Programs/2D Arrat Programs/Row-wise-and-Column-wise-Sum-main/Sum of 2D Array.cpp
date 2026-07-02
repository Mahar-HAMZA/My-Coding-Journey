#include<iostream>
using namespace std;
class Array{
	public:
		void RowSum(int arr[3][3]){
			int sum;
			cout<<"   Row Wise Sum of 2D Array   "<<endl;
			for(int i=0; i<=2; i++){
				sum=0;
				for(int j=0; j<=2;  j++){
					sum+=arr[i][j];
				}
				cout<<"Sum of Row "<<i<<": "<<sum<<endl;
			}
		}
		void ColSum(int arr[3][3]){
			int sum=0;
			cout<<"   Colomn Wise Sum of 2D Array   "<<endl;
			for(int i=0; i<=2; i++){
				sum=0;
				for(int j=0; j<=2; j++){
					sum+=arr[j][i];
				}
				cout<<"Sum of Colomn "<<i<<": "<<sum<<endl;
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
		cout<<endl;
	}
	
	for(int i=0; i <= 2; i++){
		for(int j=0; j <= 2; j++){
			cout<<arr[i][j]<<"	";
		}
		cout<<endl;
	}
	a1.RowSum(arr);
	a1.ColSum(arr);
	
}
