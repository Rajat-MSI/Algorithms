package pattern;

public class HalfDiamond
{
    public static void main(String[] args)
    {
        int size = 6;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<size-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
