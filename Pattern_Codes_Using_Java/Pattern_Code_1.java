// Pattern Code 1
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

package Pattern_Codes_Using_Java;

public class Pattern_Code_1
{
    int PatternCode1(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
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
        Pattern_Code_1 obj = new Pattern_Code_1();
        obj.PatternCode1(num);
    }
}