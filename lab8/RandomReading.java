import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomReading
{
    private static final int RECORD_SIZE = 18; 
    private static final int NAME_SIZE = 10;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        while (true) 
        {
            System.out.println("\n--- 学生记录管理系统 ---");
            System.out.println("1. 添加学生记录");
            System.out.println("2. 按学号查询");
            System.out.println("3. 修改学生年龄");
            System.out.println("4. 退出系统");
            System.out.print("请选择操作 (1-4): ");
            
            int choice = sc.nextInt();
            if (choice == 4) 
            {
                System.out.println("谢谢使用，系统已退出！");
                break;
            }

            switch (choice) 
            {
                case 1:
                    System.out.print("请输入学号: ");
                    int id = sc.nextInt();
                    System.out.print("请输入姓名(英文/拼音): ");
                    String name = sc.next();
                    System.out.print("请输入年龄: ");
                    int age = sc.nextInt();
                    addRecord(id, name, age);
                    break;
                case 2:
                    System.out.print("请输入要查询的学号: ");
                    int searchId = sc.nextInt();
                    queryById(searchId);
                    break;
                case 3:
                    System.out.print("请输入要修改的学号: ");
                    int updateId = sc.nextInt();
                    System.out.print("请输入新的年龄: ");
                    int newAge = sc.nextInt();
                    updateAge(updateId, newAge);
                    break;
                default:
                    System.out.println("无效选择，请重新输入！");
            }
        }
        sc.close();
    }

    public static void addRecord(int id, String name, int age) 
    {
        RandomAccessFile raf = null;
        try 
        {
            raf = new RandomAccessFile("students.dat", "rw");
            
            raf.seek(raf.length());

            raf.writeInt(id);

            if (name.length() > NAME_SIZE) 
            {
                name = name.substring(0, NAME_SIZE);
            } 
            else 
            {
                name = String.format("%-10s", name);
            }
            raf.writeBytes(name);

            raf.writeInt(age);

            System.out.println("记录添加成功！");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (raf != null) 
            {
                try { raf.close(); } catch (IOException e) { e.printStackTrace(); }
            }
        }
    }

    public static void queryById(int searchId) 
    {
        RandomAccessFile raf = null;
        try 
        {
            raf = new RandomAccessFile("students.dat", "rw");
            long fileLength = raf.length();
            long totalRecords = fileLength / RECORD_SIZE;
            boolean found = false;

            for (int i = 0; i < totalRecords; i++) 
            {
                raf.seek(i * RECORD_SIZE);
                
                int currentId = raf.readInt();

                if (currentId == searchId) 
                {
                    byte[] nameBytes = new byte[NAME_SIZE];
                    raf.readFully(nameBytes);
                    String name = new String(nameBytes).trim();
                    
                    int age = raf.readInt();

                    System.out.println("【查询结果】学号: " + currentId + ", 姓名: " + name + ", 年龄: " + age);
                    found = true;
                    break;
                }
            }

            if (!found) 
            {
                System.out.println("抱歉，未找到学号为 " + searchId + " 的学生记录！");
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (raf != null) 
            {
                try { raf.close(); } catch (IOException e) { e.printStackTrace(); }
            }
        }
    }

    public static void updateAge(int updateId, int newAge) 
    {
        RandomAccessFile raf = null;
        try 
        {
            raf = new RandomAccessFile("students.dat", "rw");
            long fileLength = raf.length();
            long totalRecords = fileLength / RECORD_SIZE;
            boolean found = false;

            for (int i = 0; i < totalRecords; i++) 
            {
                long recordStartPos = i * RECORD_SIZE;
                raf.seek(recordStartPos);
                
                int currentId = raf.readInt();

                if (currentId == updateId) 
                {
                    long agePos = recordStartPos + 14; 
                    
                    raf.seek(agePos);
                    raf.writeInt(newAge);

                    System.out.println("学号 " + updateId + " 的年龄成功更新为: " + newAge);
                    found = true;
                    break;
                }
            }

            if (!found) 
            {
                System.out.println("更新失败，未找到学号为 " + updateId + " 的学生记录！");
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (raf != null) 
            {
                try { raf.close(); } catch (IOException e) { e.printStackTrace(); }
            }
        }
    }
}