package pattern;

public class AlphaHillTriangle
{
    public static void main(String[] args)
    {
        int size = 6;
        for(int i=0;i<size;i++)
        {
            char ch = 'A';
            for(int j=i;j<size-1;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print(ch + " ");
                if(j >= (2*i+1)/2)
                {
                    ch--;
                }
                else
                {
                    ch++;
                }
            }
            for(int j=i;j<size-1;j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
