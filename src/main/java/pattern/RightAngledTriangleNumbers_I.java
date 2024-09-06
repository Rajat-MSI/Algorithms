package pattern;

public class RightAngledTriangleNumbers_I
{
    public static void main(String[] args)
    {
        int size = 6;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
