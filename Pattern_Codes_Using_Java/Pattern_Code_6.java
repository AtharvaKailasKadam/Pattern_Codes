// Pattern Code 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

package Pattern_Codes_Using_Java;

public class Pattern_Code_6
{
    int PatternCode6 (int n)
    {
        for(int i = n; i >=1; i--)
        {
            for(int j = 1; j <=i; j++)
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
        Pattern_Code_6 PC6 = new Pattern_Code_6();
        PC6.PatternCode6(num);
    }
}
