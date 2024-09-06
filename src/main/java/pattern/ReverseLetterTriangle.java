package pattern;

public class ReverseLetterTriangle
{
    public static void main(String[] args)
    {
        int size = 6;
        for(int i=0;i<size;i++)
        {
            char ch = 'A';
            for(int j=i;j<size;j++)
            {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
