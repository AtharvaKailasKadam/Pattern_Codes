// Pattern Code 8
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

package Pattern_Codes_Using_Java;

public class Pattern_Code_8
{
    int PatternCode8 (int n)
    {
        for(int i = 1; i <=n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*n - (2*i + 1); j++)
            {
                System.out.print("* ");
            }
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_8 PC8 = new Pattern_Code_8();
        PC8.PatternCode8(num);
    }
}