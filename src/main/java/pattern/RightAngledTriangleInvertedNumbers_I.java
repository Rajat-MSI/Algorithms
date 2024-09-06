package pattern;

public class RightAngledTriangleInvertedNumbers_I
{
    public static void main(String[] args)
    {
        int size = 6;
        for(int i=0;i<size;i++)
        {
            int k = 1;
            for(int j=i;j<size;j++)
            {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
