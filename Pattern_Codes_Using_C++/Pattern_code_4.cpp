// Write a Program to Print the Following Pattern..
//      *
//     ***
//    *****
//   *******
//  *********

#include<iostream>
using namespace std;

int main()
{
	int r=5;
	int c=9;
	
	// Logic to Find the Middle term of the Column.
	int m=(c*0.5)+1;
	
	cout<<"Number of Rows : "<<r<<endl;
	cout<<"Number of Columns : "<<c<<endl;
	cout<<"Middle Column is : "<<m<<endl;
	
	int i;
	int j;
	
	for(i=1;i<=r;i++)
	{
		for(j=1;j<=c;j++)
		{
			if(i==r||j==m||(i==2&&j==4)||(i==2&&j==6)||(i==3&&(j==4||j==7||j==3||j==6)||(i==4&&(j==2||j==3||j==4||j==6||j==7||j==8))))
			{			
			cout<<" * ";
			}
			else
			{
				cout<<"   ";
			}
		}
		
		cout<<endl;
	}
	cout<<"Program Executed Successfully...!";
}

