// Write a Program to Print the Pattern : ..
// *
// **
// ***
// ****
// *****
// ******
// and so on...

#include<iostream>

using namespace std;
 
int main()
{
	// 'n' will be the number till which u want the patter to be Drawn.
	int n;
	
	cout<<"Enter The Value Of n : ";
	cin>>n;
	
	int i;
	int j;
	
	for(i=n;i>=1;i--)
	{
		for(j=n;j>=i;j--)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	
	
}