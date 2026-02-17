// Pattern Code 20
// E D C B A
// E D C B
// E D C
// E D
// E

package Pattern_Codes_Using_Java;

public class Pattern_Code_20
{
    int PatternCode20 (int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(char ch = 'E'; ch >= 'A' +  i; ch--)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_20 PC20 = new Pattern_Code_20();
        PC20.PatternCode20(num);
    }
}