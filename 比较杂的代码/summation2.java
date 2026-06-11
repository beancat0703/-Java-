public class summation2 
{
    public static void main(String args[])
    {
        int i, j;
        long sum_total = 0;
        for(i = 1; i <= 10; i++)
        {
            long a = 1;
            long sum_temp = 1;
            for(j = 2; j <= i; j++)
            {                 
                a = a * 10;
                sum_temp = sum_temp + a;
            }
            sum_temp = 8 * sum_temp;
            sum_total = sum_total + sum_temp;
        }
        System.out.printf("The sum is %d\n", sum_total);
    }
}
