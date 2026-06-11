import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ImageCopier 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入源文件路径：");
        String sourcePath = sc.nextLine();
        System.out.printf("请输入目标文件路径：");
        String destPath = sc.nextLine();

        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists())
        {
            System.out.println("源文件不存在！");
            sc.close();
            return;
        }

        FileInputStream fis = new FileInputStream(sourcePath);
        FileOutputStream fos = new FileOutputStream(destPath);

        byte buffer[] = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1)
        {
            fos.write(buffer, 0, len);
        }

        System.out.println("文件复制成功！");

        fis.close();
        fos.close();
        sc.close();
    }
}
