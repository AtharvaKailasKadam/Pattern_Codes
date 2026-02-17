// Pattern Code 13
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

package Pattern_Codes_Using_Java;

public class Pattern_Code_13
{
    int PatternCode14 (int n)
    {
        int count = 1;
        for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(count + " ");
                    count = count + 1;
                }
                System.out.println();
            }
        return 0;
    }

    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_13 PC13 = new Pattern_Code_13();
        PC13.PatternCode14(num);
    }
}
