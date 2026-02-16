// Pattern Code 4
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

package Pattern_Codes_Using_Java;
public class Pattern_Code_4
{
    int PatternCode4(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_4 PC4 = new Pattern_Code_4();
        PC4.PatternCode4(num);
    }
}