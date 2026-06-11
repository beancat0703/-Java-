import javax.swing.*;
import java.awt.*;

public class StyleSitting 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("个人偏好设置");
        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 1));
        
        JLabel label1 = new JLabel("主题风格：");
        frame.add(label1);

        JRadioButton lightTheme = new JRadioButton("浅色主题");
        JRadioButton darkTheme = new JRadioButton("深色主题");
        ButtonGroup styleButton = new ButtonGroup();
        JPanel stylePanel = new JPanel();
        styleButton.add(lightTheme);
        styleButton.add(darkTheme);
        stylePanel.add(lightTheme);
        stylePanel.add(darkTheme);
        frame.add(stylePanel);

        JLabel label2 = new JLabel("字体大小：");
        frame.add(label2);

        JRadioButton small = new JRadioButton("小");
        JRadioButton medium = new JRadioButton("中");
        JRadioButton large = new JRadioButton("大");
        ButtonGroup fontSize = new ButtonGroup();
        fontSize.add(small);
        fontSize.add(medium);
        fontSize.add(large);
        JPanel fontSizePanel = new JPanel();
        fontSizePanel.add(small);
        fontSizePanel.add(medium);
        fontSizePanel.add(large);
        frame.add(fontSizePanel);

        JCheckBox noticeBox = new JCheckBox("启用通知");
        JCheckBox saveBox = new JCheckBox("自动保存");
        JPanel functionPanel = new JPanel();
        functionPanel.add(noticeBox);
        functionPanel.add(saveBox);
        frame.add(functionPanel);

        JButton apply = new JButton("应用");
        frame.add(apply);
        
        JLabel display = new JLabel();
        frame.add(display);

        apply.addActionListener(e ->
            {
                String state1 = "未启用";
                String state2 = "未启用";
                String style = "";
                String size = "";

                if (lightTheme.isSelected()) style = "浅色主题";
                if (darkTheme.isSelected()) style = "深色主题";
                if (small.isSelected()) size = "小";
                if (medium.isSelected()) size = "中";
                if (large.isSelected()) size = "大";
                if (noticeBox.isSelected()) state1 = "已启用";
                if (saveBox.isSelected()) state2 = "已启用";

                display.setText("主题=" + style + "，字体大小=" + size + "，启用通知=" + state1 + "，自动保存：" + state2);
            }
        );

        frame.setVisible(true);
    }
}
