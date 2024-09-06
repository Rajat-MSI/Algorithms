package pattern;

public class CrownNumbers
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
            for(int j=1;j<(2*size)-(2*i)-1;j++)
            {
                System.out.print("  ");
            }
            int k = i+1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(k-- + " ");
            }
            System.out.println();
        }
    }
}
