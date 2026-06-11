public class summation1 
{
    public static double pow(double x, int n)
    {
        int i;
        double mul = 1;
        for(i = 1; i <= n; i ++)
        {
            mul = mul * x;
        }
        return mul;
    }
    public static void main(String args[])
    {
        int i;
        double total_sum = 0;
        double an;
        for(i = 1; i <= 10000; i++)
        {
            an = pow(-1.0, i) * 1.0 / (2 * i - 1);
            total_sum = total_sum + an;
        }
        System.out.printf("结果为%f\n", total_sum);
    }
}
