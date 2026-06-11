import javax.swing.*;
import java.awt.*;

public class LibrarySystem 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("图书管理系统");
        frame.setSize(700, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu bookManageMenu = new JMenu("图书管理");
        JMenu readerManageMenu = new JMenu("读者管理");
        JMenu SystemSettingMenu = new JMenu("系统设置");
        menuBar.add(bookManageMenu);
        menuBar.add(readerManageMenu);
        menuBar.add(SystemSettingMenu);

        JMenuItem addBookItem = new JMenuItem("添加图书");
        JMenuItem searchBookItem = new JMenuItem("查询图书");
        JMenuItem deleteBookItem = new JMenuItem("删除图书");
        bookManageMenu.add(addBookItem);
        bookManageMenu.add(searchBookItem);
        bookManageMenu.add(deleteBookItem);

        JMenu themeColorMenu = new JMenu("主题颜色");
        SystemSettingMenu.add(themeColorMenu);

        JMenuItem defaultColor = new JMenuItem("默认");
        JMenuItem blueColor = new JMenuItem("浅蓝");
        JMenuItem grayColor = new JMenuItem("浅灰");
        themeColorMenu.add(defaultColor);
        themeColorMenu.add(blueColor);
        themeColorMenu.add(grayColor);

        JLabel label = new JLabel("当前状态：系统已启动");
        frame.add(label, BorderLayout.SOUTH);

        JTextArea textArea = new JTextArea();
        frame.add(textArea, BorderLayout.CENTER);

        addBookItem.addActionListener(e -> textArea.setText("正在添加新书..."));
        searchBookItem.addActionListener(e -> textArea.setText("正在查询新书..."));
        deleteBookItem.addActionListener(e -> textArea.setText("正在删除新书..."));

        defaultColor.addActionListener(e -> textArea.setBackground(Color.WHITE));
        blueColor.addActionListener(e -> textArea.setBackground(new Color(210, 230, 250)));
        grayColor.addActionListener(e -> textArea.setBackground(new Color(230, 230, 230)));

        frame.setVisible(true);
    }
}       
