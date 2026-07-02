#include<iostream>
using namespace std;
void PrintNum(int a, int n){
	if(a == n){
		cout<<a<<endl;
		return;
	}
	cout<<a<<"	";
	PrintNum(a+1, n);
}
int main()
{
	int value;
	cout<<"Enter value: ";
	cin>>value;
	PrintNum(1, value);
	
}
