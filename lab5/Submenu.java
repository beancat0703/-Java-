import javax.swing.*;
import java.awt.Color;

public class Submenu 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("子菜单实例");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("设置");
        JMenu colorMenu = new JMenu("颜色");

        JMenuItem font = new JMenuItem("字体");
        JMenuItem red = new JMenuItem("红色");
        JMenuItem blue = new JMenuItem("蓝色");
        JMenuItem green = new JMenuItem("绿色");

        colorMenu.add(font);
        colorMenu.add(red);
        colorMenu.add(blue);
        colorMenu.add(green);
        menu.add(colorMenu);
        menu.add(font);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        JLabel colorChoose = new JLabel("请选择颜色");
        frame.add(colorChoose);

        red.addActionListener(e -> colorChoose.setForeground(Color.red));
        blue.addActionListener(e -> colorChoose.setForeground(Color.blue));
        green.addActionListener(e -> colorChoose.setForeground(Color.green));

        frame.setVisible(true);
    }
}
