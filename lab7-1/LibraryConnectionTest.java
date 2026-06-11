import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LibraryConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/library_db";
        String user = "root";
        String password = "123456";

        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("连接图书数据库成功");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("连接失败，未找到数据库驱动：" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("连接失败，数据库异常信息：" + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("资源关闭时发生异常：" + e.getMessage());
                }
            }
        }
    }
}