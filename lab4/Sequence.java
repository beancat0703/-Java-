import java.util.Scanner;

class Summation
{
    public int summation1(int d, int a1, int n)
    {
        int sum = n * a1 + (n * (n - 1) * d) / 2;
        return sum;
    }
    public double summation2(double q, int a1, int n)
    {
        double sum = a1 * (1 - pow(q, n)) / (1 - q);
        return sum;
    }
    public double pow(double q, int n)
    {
        double mul = 1;
        for(int i = 1; i <= n; i++)
        {
            mul = mul * q;
        }
        return mul;
    }
}

public class Sequence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入等差数列的首项、公差和求和的数量:\n");
        int a1 = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.print("请输入等比数列的首项、公比和求和的数量:\n");
        int a2 = sc.nextInt();
        double q = sc.nextDouble();
        int n1 = sc.nextInt();
        
        Summation sum = new Summation();
        System.out.printf("等差数列的和为%d\n", sum.summation1(d, a1, n));
        System.out.printf("等比数列的和为%.2f\n", sum.summation2(q, a2, n1));
    }
}

