import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HobbyInvestigation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("兴趣爱好调查程序");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1));

        JLabel label1 = new JLabel("请选择你的兴趣爱好");
        frame.add(label1);

        JPanel hobbyPanel = new JPanel();
        JCheckBox reading = new JCheckBox("阅读");
        JCheckBox music = new JCheckBox("音乐");
        JCheckBox sports = new JCheckBox("运动");
        JCheckBox traveling = new JCheckBox("旅游");
        hobbyPanel.add(reading);
        hobbyPanel.add(music);
        hobbyPanel.add(sports);
        hobbyPanel.add(traveling);
        frame.add(hobbyPanel);

        JLabel label2 = new JLabel("请选择你的性别");
        frame.add(label2);

        ButtonGroup gender = new ButtonGroup();
        JRadioButton male = new JRadioButton("男性");
        JRadioButton female = new JRadioButton("女性");
        gender.add(male);
        gender.add(female);
        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        frame.add(genderPanel);

        JButton submit = new JButton("提交");
        JLabel display = new JLabel();
        submit.addActionListener(e -> {
            String genderSelected;
            if (male.isSelected()) {
                genderSelected = male.getText();
            }
            else if (female.isSelected()) {
                genderSelected = female.getText();
            }
            else {
                System.out.println("请选择性别");
                return;
            }

            ArrayList<String> hobbies = new ArrayList<>();
            if (reading.isSelected()) hobbies.add(reading.getText());
            if (music.isSelected()) hobbies.add(music.getText());
            if (sports.isSelected()) hobbies.add(sports.getText());
            if (traveling.isSelected()) hobbies.add(traveling.getText());
            if (hobbies.isEmpty()) {
                display.setText("请选择至少一个兴趣爱好");
                return;
            }

            String hobbyResult = String.join(", ", hobbies);
            display.setText("性别：" + genderSelected + " 兴趣爱好：" + hobbyResult);

        });
        frame.add(submit);
        frame.add(display);

        frame.setVisible(true);
    }
}
