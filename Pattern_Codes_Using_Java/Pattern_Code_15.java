// Pattern Code 15
// A B C D E F
//  B C D E
// A B C D
// A B C
// A B
// A

package Pattern_Codes_Using_Java;

public class Pattern_Code_15
{
    int PatternCode15 (int n)
    {
        for(int i = n; i >=  1; i--)
        {
            for(char ch = 'A'; ch <= 'A' + i-1; ch++)
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
        Pattern_Code_15 PC15 = new Pattern_Code_15();
        PC15.PatternCode15(num);
    }
}
