import java.util.Scanner;

class InvalidScoreException extends Exception
{
    public InvalidScoreException(String message)
    {
        super(message);
    }
}

public class GradeSystem 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.printf("请输入学生姓名：");
        String name = sc.nextLine();
        try
        {
            System.out.printf("请输入学生成绩：");   
            if (!sc.hasNextInt())
            {
                throw new Exception("成绩必须是整数！");
            }
            int score = sc.nextInt();

            checkScore(score);

            String grade = getGrade(score);
            System.out.printf("学生：%s 成绩：%d 等第：%s\n", name, score, grade);
        } 
        catch (InvalidScoreException e)
        {
            System.out.println(e.getMessage());
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

    public static void checkScore(int score) throws InvalidScoreException
    {
        if (score < 0 || score > 100)
        {
            throw new InvalidScoreException("成绩超出范围，必须在0到100之间！");
        }
    }

    public static String getGrade(int score)
    {
        if (score >= 90) return "优秀";
        if (score >= 80) return "良好";
        if (score >= 60) return "及格";
        return "不及格";
    }
}


