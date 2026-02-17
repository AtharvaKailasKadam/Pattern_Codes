// Pattern Code 17
//     A
//    A B A
//   A B C B A
//  A B C D C B A
// A B C D E D C B A

package Pattern_Codes_Using_Java;

public class Pattern_Code_17 {
    int PatternCode17 (int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                System.out.print(" ");
            }
            char ch = 'A';
            for(int j = 0; j < 2*i + 1; j++)
            {
                System.out.print(ch+" ");
                if(j < i)
                {
                    ch++;
                }
                else
                {
                    ch--;
                }
            }
            for(int j = 0; j < n - i - 1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int num = 5;
        Pattern_Code_17 PC17 = new Pattern_Code_17();
        PC17.PatternCode17(num);
    }
}
