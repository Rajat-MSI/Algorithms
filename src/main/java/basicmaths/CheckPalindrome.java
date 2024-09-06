package basicmaths;

public class CheckPalindrome
{
    public static String checkPalindrome(int num)
    {
        int temp = num;
        int rev = 0;
        while(temp != 0)
        {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(rev != num)
        {
            return "Not Palindrome";
        }
        return "Palindrome";
    }
    public static void main(String[] args)
    {
        int num = 12321;
        System.out.println(checkPalindrome(num));
    }
}
