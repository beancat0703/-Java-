import javax.swing.*;
import java.awt.*;

public class Abs
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("abs");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        JLabel inputLabel = new JLabel("请输入一个数：");
        frame.add(inputLabel);

        JTextField inputField = new JTextField();
        frame.add(inputField);

        JLabel outputLabel = new JLabel("该数的绝对值：");
        frame.add(outputLabel);

        JTextField outputField = new JTextField();
        inputField.addActionListener(e ->
            {
                String input = inputField.getText();
                int inputNum = Integer.parseInt(input);
                int ans;
                if (inputNum >= 0)
                {
                    ans = inputNum;
                }
                else
                {
                    ans = -inputNum;
                }
                outputField.setText(String.valueOf(ans));
            }
        );
        frame.add(outputField);

        frame.setVisible(true);
    }
}
