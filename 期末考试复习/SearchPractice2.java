import java.sql.*;

public class SearchPractice2 {
    public static void main(String[] args) {
        String drive = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/mydb?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf-8&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "123456";

        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            Class.forName(drive);
            con = DriverManager.getConnection(url, user, password);
            stat = con.createStatement();

            String sql = "SELECT * FROM studentInfo";
            rs = stat.executeQuery(sql);

            while(rs.next()) {
                String stuNo = rs.getString("stuNo");
                String stuName = rs.getString("stuName");
                String stuBirth = rs.getString("stuBirth");
                System.out.println(stuNo + '\t' + stuName + '\t' + stuBirth);
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
