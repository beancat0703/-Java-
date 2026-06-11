import javax.swing.*;
import java.awt.FlowLayout;

public class FlowLayoutExample 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("FlowLayout布局示例");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel userLabel = new JLabel("用户名：");
        JTextField userText = new JTextField(15);

        JLabel passLabel = new JLabel("密码：");
        JPasswordField passText = new JPasswordField(15);

        JButton loginButton = new JButton("登录");
        JButton cancelButton = new JButton("取消");

        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginButton);
        frame.add(cancelButton);

        loginButton.addActionListener(e -> 
        {
            String username = userText.getText();
            String password = new String(passText.getPassword());

            System.out.println("用户名：" + username);
            System.out.println("密码：" + password);
        });

        frame.setVisible(true);
    }
}
