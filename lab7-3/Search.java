import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Search {
    private static final String URL = "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC&characterEncoding=utf8&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
        String sql = "SELECT id, name, age, major FROM student WHERE name = ?";

        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, "李四");

            try (ResultSet rs = pstmt.executeQuery()) {
                
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    String major = rs.getString("major");

                    System.out.println("====== 查询成功 ======");
                    System.out.println("学生编号: " + id);
                    System.out.println("学生姓名: " + name);
                    System.out.println("学生年龄: " + age);
                    System.out.println("所属专业: " + major);
                } else {
                    System.out.println("查无此人");
                }
            }

        } catch (SQLException e) {
            System.err.println("数据库操作发生异常，请检查配置！");
            e.printStackTrace();
        }
    }
}