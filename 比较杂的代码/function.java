import java.util.Scanner;
public class function 
{
    public static void main(String args[])
    {
        System.out.printf("x = ");
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        if(x < 0)
        {
            System.out.printf("y = %d\n", -1 + 2 * x);
        }
        else if(x == 0)
        {
            System.out.printf("y = -1\n");
        }
        else
        {
            System.out.printf("y = %d\n", -1 + 3 * x);
        }
    }
}
