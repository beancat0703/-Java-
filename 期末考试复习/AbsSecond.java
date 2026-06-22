import javax.swing.*;
import java.awt.*;

public class AbsSecond
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("abs");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        JLabel inputLabel = new JLabel("请输入一个数：");
        frame.add(inputLabel);

        JTextField input = new JTextField();
        frame.add(input);

        JLabel outputLabel = new JLabel("该数字的绝对值：");
        frame.add(outputLabel);

        JTextField output = new JTextField();
        frame.add(output);

        input.addActionListener(e ->
        {
            String inputStr = input.getText();
            int inputNum = Integer.parseInt(inputStr);
            int ans;
            if (inputNum < 0)
            {
                ans = -inputNum;
            }
            else
            {
                ans = inputNum;
            }
            output.setText(String.valueOf(ans));
        });

        frame.setVisible(true);
    }
}