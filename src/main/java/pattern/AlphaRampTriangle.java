package pattern;

public class AlphaRampTriangle
{
    public static void main(String[] args)
    {
        int size = 6;
        char ch = 'A';
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
