package basicmaths;

public class CountDigits
{
    public static int countDigit(int num)
    {
        int count = 0;
        while(num != 0)
        {
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int num = 12345;
        System.out.println(countDigit(num));
    }
}
