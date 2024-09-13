#include<iostream>
using namespace std;

int main()
{
	int n;
	
	cout<<"Enter the Number of n : ";
	cin>>n;
	int i,j;
	
	for(i=n;i>=1;i--)
	{
		for(j=n;j>=i;j--)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
}