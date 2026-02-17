// Pattern Code 16
// A
// B B
// C C C
// D D D D
// E E E E E


package Pattern_Codes_Using_Java;

public class Pattern_Code_16
{
    int PatternCode16 (int n)
    {
        char ch = 'A';
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_16 PC16 = new Pattern_Code_16();
        PC16.PatternCode16(num);
    }
}
