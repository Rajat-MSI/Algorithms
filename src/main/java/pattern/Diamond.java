package pattern;

public class Diamond
{
    public static void triangle(int size)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=i;j<size-1;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("* ");
            }
            for(int j=i;j<size-1;j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void inverseTriangle(int size)
    {
        for(int i=1;i<size;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<(2*size)-(2*i)-1;j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int size = 6;
        triangle(size);
        inverseTriangle(size);

    }
}
