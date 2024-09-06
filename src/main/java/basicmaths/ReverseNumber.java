package basicmaths;

public class ReverseNumber
{
    public static int reverseNumber(int num)
    {
        int rev = 0;
        for(int i=num;i!=0;i/=10)
        {
            rev = rev * 10 + i % 10
            ;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        int num = 12345;
        System.out.println(reverseNumber(num));
    }
}
