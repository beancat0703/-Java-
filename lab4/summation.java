import java.util.Scanner;

public class summation 
{
    public static void equation(int a, int b, int c)
    {
        System.out.printf("x²的系数为%d\n", a);
        System.out.printf("x的系数为%d\n", b);
        System.out.printf("常数为%d\n", c);
        System.out.printf("该方程为%dx²+%dx+%d=0\n", a, b, c);
        double delta = b * b - 4 * a * c;
        if(delta > 0)
        {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("原方程的解为: x1 = %.2f x2 = %.2f\n", x1, x2);
        }
        else if (delta == 0)
        {
            double x = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.printf("原方程的解为: x = %.2f\n", x);
        }
        else
        {
            double r = (-b) / (2 * a);
            double i = (Math.sqrt(delta * -1)) / (2 * a);
            System.out.printf("原方程的解为: x1 = %.2f+%.2fi x2 = %.2f-%.2fi\n",r, i, r, i);
        }   
    }

    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.printf("请分别输入x²的系数、x的系数以及常数:\n");
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        equation(a, b, c);
    }
}
