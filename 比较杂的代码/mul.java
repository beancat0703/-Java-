import java.util.Scanner;
public class mul
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        int mul = 1;
        int x = reader.nextInt();
        while(x != 0)
        {
            mul = mul * x;
            x = reader.nextInt();
        }
        System.out.printf("乘积为%d\n", mul);
    }
}
