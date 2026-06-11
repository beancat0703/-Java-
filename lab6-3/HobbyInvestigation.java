import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HobbyInvestigation 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("兴趣爱好调查");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1));

        JLabel label1 = new JLabel("请选择你的兴趣爱好：");
        JPanel hobbyPanel = new JPanel();
        JCheckBox reading = new JCheckBox("阅读");
        JCheckBox music = new JCheckBox("音乐");
        JCheckBox sports = new JCheckBox("运动");
        JCheckBox traveling = new JCheckBox("旅游");
        hobbyPanel.add(reading);
        hobbyPanel.add(music);
        hobbyPanel.add(sports);
        hobbyPanel.add(traveling);
        frame.add(label1);
        frame.add(hobbyPanel);

        JLabel label2 = new JLabel("请选择性别：");
        JRadioButton male = new JRadioButton("男");
        JRadioButton female = new JRadioButton("女");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        frame.add(label2);
        frame.add(genderPanel);

        JButton submission = new JButton("提交");
        JLabel display = new JLabel();
        frame.add(submission);
        frame.add(display);
        submission.addActionListener(e ->
            {
                String gender;
                if (male.isSelected())
                {
                    gender = "男";
                }
                else if (female.isSelected())
                {
                    gender = "女";
                } 
                else
                {
                    display.setText("请选择一个性别");
                    return;
                }

                ArrayList<String> hobbies = new ArrayList<>();
                if (reading.isSelected()) hobbies.add(reading.getText());
                if (music.isSelected()) hobbies.add(music.getText());
                if (sports.isSelected()) hobbies.add(sports.getText());
                if (traveling.isSelected()) hobbies.add(traveling.getText());
                if (hobbies.isEmpty())
                {
                    display.setText("请至少选择一个兴趣爱好");
                    return;
                }

                String hobbiesResult = String.join(",", hobbies);
                display.setText("性别：" + gender + "，兴趣爱好：" + hobbiesResult);

            }
        );

        frame.setVisible(true);
    }
}
