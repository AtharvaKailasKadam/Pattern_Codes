// Pattern Code 10
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * *
//* * * *
//* * *
//* *
//*

package Pattern_Codes_Using_Java;


// First Loop for 2*n-1 Stars and 2*n-1 Spaces
public class Pattern_Code_10
{
    int PatternCode10(int n)
    {
        for(int i = 0; i <= 2*n-1; i++)
        {
            int stars = i;
            if(i > n)
            {
                stars = 2*n - i;
            }
            for(int j = 0; j < stars; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_10 PC10 = new Pattern_Code_10();
        PC10.PatternCode10(num);
    }
}
