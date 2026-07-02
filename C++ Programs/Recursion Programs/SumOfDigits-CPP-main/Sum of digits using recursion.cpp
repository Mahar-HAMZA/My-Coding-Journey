#include<iostream>
using namespace std;
void DigitsSum(int digit, int sum){
	if(digit == 0){
		cout<<"Sum: "<<sum<<endl;
		return;
	}
	int reverse=digit % 10;
	sum+=reverse;
	int div=digit / 10;
	DigitsSum(div, sum);
}
int main()
{
	int digits;
	cout<<"Enter digits: ";
	cin>>digits;
	DigitsSum(digits, 0);
	
}
