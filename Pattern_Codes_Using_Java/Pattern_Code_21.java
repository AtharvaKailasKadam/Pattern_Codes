// Pattern Code 22
// *                 *
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *
// * * * *     * * * *
// * * *         * * *
// * *             * *
// *                 *

package Pattern_Codes_Using_Java;

public class Pattern_Code_21
{
    void PatternCode22(int n)
    {
        for(int i = 1; i < 2*n-1; i++)
        {
            int Stars = i;
            if( i > n)
            {
                Stars = 2*n-i;
            }
            for(int j = 1; j <= Stars; j++)
            {
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-Stars); j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= Stars; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_21 PC22 = new Pattern_Code_21();
        PC22.PatternCode22(num);
    }
}
