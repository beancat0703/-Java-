import java.util.Scanner;

public class IsLeapYear
{
    public static void main(String[] args)
    {
        System.out.printf("请输入一个整数:");
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt();
        C judge = new C();
        judge.leapyear(n);
    }
}

class C
{
    public void leapyear(int n)
    {
        if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
        {
            System.out.printf("%d年是闰年!\n", n);
        }
        else
        {
            System.out.printf("%d年不是闰年!\n", n);   
        }
    }
}