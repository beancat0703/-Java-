import java.sql.*;

public class PrepareStatementPractice
{
    public static void main(String[] args)
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/mydb?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf-8";
        String user = "root";
        String password = "123456";

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pstat = null;

        try
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM studentInfo WHERE stuName = ?";
            pstat = conn.prepareStatement(sql);
            pstat.setString(1, "张三");
            rs = pstat.executeQuery();

            boolean state = false;

            while (rs.next())
            {
                String stuNo = rs.getString("stuNo");
                String stuName = rs.getString("stuName");
                String stuBirth = rs.getString("stuBirth");

                System.out.println("查询成功！");
                System.out.println(stuNo + "\t" + stuName + "\t" + stuBirth);
                state = true;
            }

            if (!state)
            {
                System.out.println("未查询到该学生");
            }
        }
        catch(Exception e)

        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                conn.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
