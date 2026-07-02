#include<iostream>
using namespace std;
void ReverseDigit(int digit){
	if(digit == 0){
		return;
	}
	int reverse=digit % 10;
	cout<<reverse;
	int div=digit / 10;
	ReverseDigit(div);
}
int main()
{
	int digits;
	cout<<"Enter digits: ";
	cin>>digits;
	ReverseDigit(digits);
}
