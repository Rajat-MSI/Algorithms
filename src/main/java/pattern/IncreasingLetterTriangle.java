package pattern;

public class IncreasingLetterTriangle
{
    public static void main(String[] args)
    {
        int size = 6;
        for(int i=0;i<size;i++)
        {
            char ch = 'A';
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
