package basicmaths;

public class ArmstrongNumber
{
    public static String armstrongNumber(int num)
    {
        int temp = num;
        int length = String.valueOf(num).length();
        int sum = 0;
        while(num != 0)
        {
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit,length);
            num /= 10;
        }
        if(temp == sum)
        {
            return "Armstrong Number";
        }
        return "Not Armstrong Number";
    }
    public static void main(String[] args)
    {
        int num = 371;
        System.out.println(armstrongNumber(num));
    }
}
