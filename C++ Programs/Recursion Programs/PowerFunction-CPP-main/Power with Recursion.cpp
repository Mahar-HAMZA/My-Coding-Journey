#include<iostream>
using namespace std;
void power(int pow, int num, int result){
	if(pow == 1){
		cout<<result<<endl;
		return;
	}
	result=result*num;
	power(pow-1, num, result);
}
int main()
{
	int num,pow;
	cout<<"Enter a number: ";
	cin>>num;
	cout<<"Enter power: ";
	cin>>pow;
	power(pow, num, num);
}
