// Pattern Code 23: Inverted Hollow Square Pattern

package Pattern_Codes_Using_Java;

public class Pattern_Code_23
{
    void PatternCode23(int n)
    {
        int size = 2 * n - 1;

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                int top = i;
                int left = j;
                int right = (size - 1) - j;
                int bottom = (size - 1) - i;

                int min = Math.min(Math.min(top, bottom), 
                Math.min(left, right));

                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int num = 4;
        Pattern_Code_23 obj = new Pattern_Code_23();
        obj.PatternCode23(num);
    }
}
