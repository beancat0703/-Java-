import java.util.Scanner;

public class Judgement 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入用户名：");
        String name = sc.nextLine();
        try
        {
            check(name);
            System.out.println("用户名合法");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            sc.close();
        }
    }


    public static void check(String name) throws Exception
    {
        if (name.length() < 6 || name.length() > 12)
        {
            throw new Exception("用户名不合法：长度必须在6到12个字符之间");
        }

        for(char c: name.toCharArray())
        {
            if (!Character.isLetterOrDigit(c))
            {
                throw new Exception("用户名不合法：只能由英文字母和数字组成");
            }
        }

        if (Character.isDigit(name.charAt(0)))
        {
            throw new Exception("用户名不合法：不能以数字开头");
        }

        int capitalNum = 0;
        for(char c: name.toCharArray())
        {
            if (Character.isUpperCase(c))
            {
                capitalNum ++;
            }
        }
        if (capitalNum == 0)
        {
            throw new Exception("用户名不合法：至少包含一个大写字母");
        }
    }
}
