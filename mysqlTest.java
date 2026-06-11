import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysqlTest {
    public static void main(String[] args) {
        // 1. 数据库连接凭证（注意：3306后面接的是你刚刚创建的数据库名 test_db）
        String url = "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "123456"; // 替换成你真实的数据库密码

        // 2. 使用 Java 8+ 自动关闭资源的 try-with-resources 骨架
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("🎉 恭喜你！Java 与 MySQL 数据库连接成功！");
            }
        } catch (SQLException e) {
            System.out.println("❌ 数据库连接失败，原因：");
            e.printStackTrace();
        }
    }
}