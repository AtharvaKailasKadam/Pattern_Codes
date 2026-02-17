// Pattern Code 21
// * * * * * * * * * *
// * * * *     * * * *
// * * *         * * *
// * *             * *
// *                 *
// *                 *
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *
package Pattern_Codes_Using_Java;

public class Pattern_Code_20
{
    void PatternCode21(int n)
    {
        int initialSpace = 0;

        // Upper Half
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
                System.out.print("* ");

            for(int j = 0; j < initialSpace; j++)
                System.out.print("  ");

            for(int j = 1; j <= i; j++)
                System.out.print("* ");

            initialSpace += 2;
            System.out.println();
        }

        // Lower Half
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
                System.out.print("* ");

            for(int j = 1; j <= 2*(n-i); j++)
                System.out.print("  ");

            for(int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_20 PC21 = new Pattern_Code_20();
        PC21.PatternCode21(num);
    }
}
