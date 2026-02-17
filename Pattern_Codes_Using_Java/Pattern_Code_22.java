// Pattern Code 22: Hollow Square Pattern
// * * * * *
// *       *
// *       *
// *       *
// * * * * *

package Pattern_Codes_Using_Java;

public class Pattern_Code_22 {
    void PatternCode22 (int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_22 PC22 = new Pattern_Code_22();
        PC22.PatternCode22(num);
    }
}
