// Pattern Code 9
//      *
//     ***
//    *****
//   *******
//  *********
//  *********
//   *******
//    *****
//     ***
//      *

package Pattern_Codes_Using_Java;

public class Pattern_Code_9
{
    int PatternCode9 (int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i-1; j++)
            {
                System.out.print("*");
            }
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j <= n; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*n-(2*i+1); j++)
            {
                System.out.print("*");
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
        Pattern_Code_9 PC9 = new Pattern_Code_9();
        PC9.PatternCode9(num);
    }

}
