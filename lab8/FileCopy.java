import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopy 
{
    public static void main(String[] args)
    {
        try(FileInputStream fis = new FileInputStream("source.png"); FileOutputStream fos = new FileOutputStream("target.png"))
        {

            byte[] buffer = new byte[8192];
            int len;

            while ((len = fis.read(buffer)) != -1)
            {
                fos.write(buffer, 0, len);
            }

            System.out.println("复制成功！");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }   
    }
}
