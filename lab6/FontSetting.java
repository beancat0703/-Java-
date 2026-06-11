import javax.swing.*;
import java.awt.*;

public class FontSetting 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("字体设置程序");
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Java图形界面");
        frame.add(label, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu menu = new JMenu("格式");
        menuBar.add(menu);

        JMenu fontSizeMenu = new JMenu("字体大小");
        JMenu fontColorMenu = new JMenu("字体颜色");
        menu.add(fontSizeMenu);
        menu.add(fontColorMenu);

        JMenuItem font16 = new JMenuItem("16");
        JMenuItem font24 = new JMenuItem("24");
        JMenuItem font32 = new JMenuItem("32");
        fontSizeMenu.add(font16);
        fontSizeMenu.add(font24);
        fontSizeMenu.add(font32);

        JMenuItem colorBlack = new JMenuItem("黑色");
        JMenuItem colorRed = new JMenuItem("红色");
        JMenuItem colorBlue = new JMenuItem("蓝色");
        fontColorMenu.add(colorBlack);
        fontColorMenu.add(colorRed);
        fontColorMenu.add(colorBlue);

        font16.addActionListener(e -> label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 16)));
        font24.addActionListener(e -> label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 24)));
        font32.addActionListener(e -> label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 32)));

        colorBlack.addActionListener(e -> label.setForeground(Color.BLACK));
        colorRed.addActionListener(e -> label.setForeground(Color.RED));
        colorBlue.addActionListener(e -> label.setForeground(Color.BLUE));

        frame.setVisible(true);
    }
}
