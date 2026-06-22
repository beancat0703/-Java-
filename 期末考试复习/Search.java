import java.sql.*;


public class Search {
    public static void main(String[] args) {
        // 1. 题目给出的数据库连接信息
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/mydb?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf-8";

        // 假设的数据库用户名和密码（通常需要根据实际情况填写，这里用 root 占位）
        String user = "root";
        String password = "123456";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 2. 加载驱动程序
            Class.forName(driver);

            // 3. 获取数据库连接
            conn = DriverManager.getConnection(url, user, password);

            // 4. 创建 Statement 对象用于执行 SQL
            stmt = conn.createStatement();

            // 5. 编写并执行 SQL 查询语句
            String sql = "SELECT stuNo, stuName, stuBirth FROM studentInfo";
            rs = stmt.executeQuery(sql);

            // 6. 遍历结果集并在控制台输出
            System.out.println("学号(身份证)\t\t姓名\t\t出生年月");
            System.out.println("---------------------------------------------");
            while (rs.next()) {
                // 根据表设计，三个字段均为文本类型（String）
                String stuNo = rs.getString("stuNo");
                String stuName = rs.getString("stuName");
                String stuBirth = rs.getString("stuBirth");

                // 输出到控制台
                System.out.println(stuNo + "\t" + stuName + "\t" + stuBirth);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 7. 关闭资源（遵循后开先闭的原则）
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}