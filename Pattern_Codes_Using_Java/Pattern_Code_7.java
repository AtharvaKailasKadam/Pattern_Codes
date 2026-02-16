// Pattern Code 7
//      *
//     ***
//    *****
//   *******
//  *********

package Pattern_Codes_Using_Java;

public class Pattern_Code_7
{
    int PatternCode7 (int n)
    {
        for(int i = 1; i <=n; i++)
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
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_7 PC7 = new Pattern_Code_7();
        PC7.PatternCode7(num);
    }
}
