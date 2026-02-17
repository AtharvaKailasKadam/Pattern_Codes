// Pattern Code 19
// E
// E D
// E D C
// E D C B
// E D C B A

package Pattern_Codes_Using_Java;

public class Pattern_Code_18
{
    int PatternCode19 (int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(char ch = 'E'; ch >= 'E' - i; ch--)
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
        Pattern_Code_18 PC19 = new Pattern_Code_18();
        PC19.PatternCode19(num);
    }
}
