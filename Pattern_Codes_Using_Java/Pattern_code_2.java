
package Pattern_Codes_Using_Java;
public class Pattern_code_2
{
    int PatternCode2(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <=i; j++)
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
        Pattern_code_2 PC2 = new Pattern_code_2();
        PC2.PatternCode2(num);
    }
}
