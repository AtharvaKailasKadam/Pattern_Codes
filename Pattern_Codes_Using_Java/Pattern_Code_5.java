// Pattern Code 5
// * * * * *
// * * * *
// * * *
// * *
// *

package Pattern_Codes_Using_Java;

public class Pattern_Code_5
{
    int PatternCode5 (int n)
    {
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_5 PC5 = new Pattern_Code_5();
        PC5.PatternCode5(num);
    }
}
