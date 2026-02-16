// Pattern Code 3
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

package Pattern_Codes_Using_Java;

public class Pattern_code_3 {
    int PattrnCode3(int n)
    {
        for(int i = 1; i <=n; i++)
        {
            for( int j = 1; j <=i; j++)
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
        Pattern_code_3 PC3 = new Pattern_code_3();
        PC3.PattrnCode3(num);
    }
}
