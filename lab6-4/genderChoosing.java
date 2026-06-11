import javax.swing.*;
import java.util.*;

public class genderChoosing
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("个人信息录入窗口");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton male = new JRadioButton("男");
        JRadioButton female = new JRadioButton("女");
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        frame.add(genderPanel);

        JButton submit = new JButton("提交");
        frame.add(submit);

        submit.addActionListener(e ->
            {
                if (male.isSelected()) 
            }
        );
    }
}