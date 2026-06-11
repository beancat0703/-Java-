import java.math.BigInteger; 

public class summation2 
{
    public static BigInteger factorial(int n)
    {
        int i;
        BigInteger mul = BigInteger.ONE;
        for(i = 1; i <= n; i ++)
        {
            mul = mul.multiply(BigInteger.valueOf(i));
        }
        return mul;
    }

    public static BigInteger factorial_n(int n)
    {
        int i;
        BigInteger sum = BigInteger.ZERO;
        for(i = 1; i <= n; i++)
        {
            sum = sum.add(factorial(i));
        }
        return sum;
    }

    public static void main(String args[])
    {
        BigInteger sum_total = factorial_n(200).subtract(factorial(100));
        System.out.println("结果为: " + sum_total);
    }
}
