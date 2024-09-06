package pattern;

public class IncreasingNumberTriangle
{
    public static void main(String[] args)
    {
        int size = 6;
        int k = 1;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
