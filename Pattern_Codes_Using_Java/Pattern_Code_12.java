// Pattern Code 12
// 1                1
// 1 2             2 1
// 1 2 3         3 2 1
// 1 2 3 4     4 3 2 1
// 1 2 3 4 5 5 4 3 2 1

package Pattern_Codes_Using_Java;

public class Pattern_Code_12
{
    int PatternCode12 (int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            for(int j = 1; j <= 2*(n-i); j++)
            {
                System.out.print("  ");
            }
            for(int j = i; j >=1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_12 PC12 = new Pattern_Code_12();
        PC12.PatternCode12(num);
    }
}
