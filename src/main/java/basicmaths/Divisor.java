package basicmaths;

public class Divisor
{
    public static int[] divisor(int num,int[] size)
    {
        int[] arr = new int[num];
        int count = 0;
        for(int i=1;i<=num;i++)
        {
            if(num % i == 0)
            {
                arr[count] = i;
                count++;
            }
        }
        size[0] = count;
        return arr;
    }
    public static void main(String[] args)
    {
        int num = 12;
        int[] size = new int[1];
        int[] res = divisor(num,size);
        System.out.print("[");
        for(int i=0;i<size[0];i++)
        {
            System.out.print(res[i]);
            if(i != size[0]-1)
            {
                System.out.print(", ");
            }
            else
            {
                System.out.println("]");
            }
        }
    }
}
