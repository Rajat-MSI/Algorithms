package pattern;

public class BinaryNumberTriangle
{
    public static void main(String[] args)
    {
        int size = 6;
        for(int i=0;i<size;i++)
        {
            int start = 0;
            if(i % 2 == 0)
            {
                start = 1;
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(start + " ");
                if(start == 1)
                {
                    start = 0;
                }
                else
                {
                    start = 1;
                }
            }
            System.out.println();
        }
    }
}
