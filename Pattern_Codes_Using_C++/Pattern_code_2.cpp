// Write a Code to Print the Following Pattern:-
// * * * * * *
// *         *
// *         *
// *         *
// *         *
// * * * * * *

#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int r;
	int c=0;
	
	cout<<"Enter the Number of Rows : "<<endl;
	cin>>r;
	
	cout<<"Enter the Number of Columns : "<<endl;
	cin>>c;
	
	int i;
	int j;
	
	for(i=1;i<=r;i++)
	{
		for(j=1;j<=c;j++)
		{
			if(i==1||j==1||i==r||j==c)
			{
				cout<<" * ";
		    }
		}
		cout<<endl;
	}
	return 0;
}
