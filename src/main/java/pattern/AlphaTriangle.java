package pattern;

public class AlphaTriangle
{
    public static void main(String[] args)
    {
        int size = 3;
        char ch = (char) ('A' + size-1);
        for(int i=0;i<size;i++)
        {
            char c = ch;
            for(int j=0;j<=i;j++)
            {
                System.out.print(c++ + " ");
            }
            ch--;
            System.out.println();
        }
    }
}
