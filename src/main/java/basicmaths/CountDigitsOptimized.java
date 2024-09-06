package basicmaths;

public class CountDigitsOptimized
{
    public static int countDigits(int num)
    {
        return (int) Math.log10(num) + 1;
    }
    public static void main(String[] args)
    {
        int num = 123456789;
        System.out.println(countDigits(num));
    }
}
