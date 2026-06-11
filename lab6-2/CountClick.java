import javax.swing.*;
import java.awt.*;

public class CountClick 
{
    private static int count = 0;

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("按钮点击计数器");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("点击次数：0");
        JButton button = new JButton("点击我");

        button.addActionListener(e ->
        {
            count ++;
            label.setText("点击次数：" + count);
        });

        frame.add(label);
        frame.add(button);

        frame.setVisible(true);
    }
}
