package pattern;

public class SymmetricButterfly
{
    public static void main(String[] args)
    {
        int size = 5;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<2*size-2*i-1;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<size;i++)
        {
            for(int j=i;j<size;j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<2*i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<size;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
