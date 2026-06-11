import java.util.Scanner;

public class JudgeNumber 
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.printf("请输入一个三位数:\n");
        int n  = reader.nextInt();
        A judge = new A();
        judge.is_number(n);
    }
}

class A
{
    public void is_number(int n)
    {
        if(n < 100 || n > 999)
        {
            System.out.printf("错误!水仙花数是三位数!\n");
        }
        else
        {
            int m = n;
            int a = m % 10;
            m = m / 10;
            int b  = m % 10;
            m = m / 10;
            int c = m % 10;
            if(a * a * a + b * b * b + c * c * c == n)
            {
                System.out.printf("%d是水仙花数!\n", n);
            }
            else
            {
                System.out.printf("%d不是水仙花数!\n", n);
            }
        }
    }
}