import java.util.Scanner;
import java.io.File;

public class FileStatics
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入目录路径：");
        String path = sc.nextLine();
        
        File dir = new File(path);
        if (!dir.exists())
        {
            System.out.println("路径不存在！");
            return;
        }
        if (!dir.isDirectory())
        {
            System.out.println("该路径不是目录！");
            return;
        }

        System.out.println("目录内容如下：");
        File[] files = dir.listFiles();

        int fileCount = 0;
        int subDirCount = 0;
        int totalSize = 0;

        if (files != null)
        {
            for (File f: files)
            {
                System.out.println(f.getName());
                if (f.isFile())
                {
                    fileCount ++;
                    totalSize += f.length();
                }
                else if (f.isDirectory())
                {
                    subDirCount ++;
                }
            }
        }

        System.out.println("");
        System.out.println("普通文件数量：" + fileCount);
        System.out.println("子目录数量：" + subDirCount);
        System.out.println("普通文件总大小：" + totalSize + "字节");
    }
}