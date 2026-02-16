// Pattern Code 11
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

package Pattern_Codes_Using_Java;

public class Pattern_Code_11
{
    int PatternCode11(int n)
    {
        int a = 0;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <=i; j++ )
            {
                if(a == 1)
                {
                    System.out.print("0 ");
                    a = 0;
                }
                else
                {
                    System.out.print("1 ");
                    a = 1;
                }
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_11 PC11 = new Pattern_Code_11();
        PC11.PatternCode11(num);
    }
}
