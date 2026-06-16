import java.io.FileReader;
import java.io.IOException;

public class FileStatistics
{
    public static void main(String[] args)
    {
        int charNum = 0;
        int wordNum = 0;
        int lineNum = 0;

        FileReader fr = null;

        boolean inWord = false;

        try
        {
            fr = new FileReader("input.txt");
            int ch;
            while ((ch = fr.read()) != -1)
            {
                char c = (char) ch;

                if (c != '\n' && c != '\r')
                {
                    charNum ++;
                }

                if (c == '\n')
                {
                    lineNum ++;
                }

                if (Character.isLetterOrDigit(c)) 
                {
                    if (!inWord) 
                    {
                        wordNum++;
                        inWord = true;
                    }
                } 
                else 
                {
                    inWord = false;
                }
            }
            
            lineNum ++;

            System.out.println("字符总数：" + charNum);
            System.out.println("单词总数：" + wordNum);
            System.out.println("总行数：" + lineNum);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fr.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}