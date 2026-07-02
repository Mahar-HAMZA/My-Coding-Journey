#include<iostream>
using namespace std;
int facto(int* fact, int n){
	if(n == 1){
		return 1;
	}
	*fact=*fact * n;
	facto(fact, n-1);
}
int main()
{
	int value;
	cout<<"Enter value: ";
	cin>>value;
	int fact=1;
	facto(&fact, value);
	cout<<"Factorial: "<<fact<<endl;
}
