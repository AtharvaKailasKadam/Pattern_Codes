// Write a Program to Print the Following Pattern.... 
// 1
// 01
// 010
// 1010
// 10101
// 010101

#include<iostream>
using namespace std;

int main()
{
	int n;
	int a=1;
	
	cout<<"Enter the Value of 'n' to Print the Pattern : ";
	cin>>n;
	
	int i=0;
	int j=0;
	
	for(i=n;i>=1;i--)
	{
		for(j=n;j>=i;j--)
		{
			// (1) A Normal logic to toggle the value of 'a' (So that if a==1 then 'a' becomes '0' n if a==0 then 'a' becomes '1')
			if(a==1)
			{
				cout<<" 0";
				a=0;
			}
			else if(a==0)
			{
				cout<<" 1";
				a=1;
			}
			else
			{
				cout<<"";
			}
			// (1) The logic ends here
		}
		cout<<endl;
	}
	return 0;
}