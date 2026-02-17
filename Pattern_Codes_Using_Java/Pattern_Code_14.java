// Pattern Code 14
// A
// A B
// A B C
// A B C D
// A B C D E

package Pattern_Codes_Using_Java;

public class Pattern_Code_14
{

    int PatternCode14 (int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(char ch = 'A'; ch <= 'A' + i; ch++)
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
        Pattern_Code_14 PC14 = new Pattern_Code_14();
        PC14.PatternCode14(num);
    }


}
