import javax.swing.*;
import java.awt.*;

public class subway
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("miss");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 1));

        JButton button = new JButton("你好");
        frame.add(button);

        JLabel label = new JLabel();
        button.addActionListener(e ->
        {
            label.setText("我想你了");
        });
        frame.add(label);

        frame.setVisible(true);
    }
}
