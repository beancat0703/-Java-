import java.util.Scanner;

public class JudgePrime 
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.printf("请输入一个正整数:");
        int n = reader.nextInt();
        B checker = new B();
        checker.is_prime(n);
    }
}

class B
{
    public void is_prime(int n)
    {
        if(n < 2)
        {
            System.out.printf("错误!素数大于1!\n");
        }
        else
        {
            int count = 0;
            int i;
            for(i = 1; i <= n ; i ++)
            {
                if(n % i == 0)
                {
                    count ++;
                }
            }
            if(count == 2)
            {
                System.out.printf("%d是素数!\n", n);
            }
            else
            {
                System.out.printf("%d不是素数!\n", n);
            }
        }
    }
}
