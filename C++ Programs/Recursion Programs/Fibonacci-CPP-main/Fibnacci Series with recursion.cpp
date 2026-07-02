#include<iostream>
using namespace std;
void fib(int a, int b, int n){
	if(n == 0){
		return;
	}
	int c=a+b;
	cout<<c<<"	";
	fib(b , c, n-1);
}
int main()
{
	int value;
	cout<<"Enter value: ";
	cin>>value;
	int a=0;
	int b=1;
	cout<<a<<"	";
	cout<<b<<"	";
	fib(a , b, value-2);
	
}
