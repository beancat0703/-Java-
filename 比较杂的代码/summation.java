public class summation
{
    public static void main(String args[])
    {
        int i = 1;
        int sum = 0;
        while(i <= 1000)
        {
            if(i % 3 == 0 && i % 7 == 0)
            {
                sum = sum + i;
            }
            i ++;
        }
        System.out.printf("The sum is %d\n", sum);
    }
}
