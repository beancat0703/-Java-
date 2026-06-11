import java.util.Scanner;

public class StringStatics 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入一段字符串:");
        String input = sc.nextLine();

        int length = input.length();
        int letter = 0;
        int num = 0;
        int space = 0;
        int other = 0;

        for (int i = 0; i < length; i ++)
        {
            char ch = input.charAt(i);
            if (Character.isLetter(ch))
            {
                letter ++;
            }
            else if (Character.isDigit(ch))
            {
                num ++;
            }
            else if (Character.isWhitespace(ch))
            {
                space ++;
            }
            else
            {
                other ++;
            }
        }

        System.out.printf("字符串长度：%d\n", length);
        System.out.printf("字母数量：%d\n", letter);
        System.out.printf("数字个数：%d\n", num);
        System.out.printf("空格数量：%d\n", space);
        System.out.printf("其他字符个数：%d\n", other);
    }
}
