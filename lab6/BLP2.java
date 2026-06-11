import javax.swing.*;
import java.awt.BorderLayout;

public class BLP2 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("简易文本编辑器");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("文件");
        JMenu editMenu = new JMenu("编辑");
        JMenuItem newMenuItem = new JMenuItem("新建");
        JMenuItem saveMenuItem = new JMenuItem("保存");
        JMenuItem exitMenuItem = new JMenuItem("退出");
        JMenuItem copyMenuItem = new JMenuItem("复制");
        JMenuItem pasteMenuItem = new JMenuItem("粘贴");
        JMenuItem clearMenuItem = new JMenuItem("清空");

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem); 
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        editMenu.add(clearMenuItem);    
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        frame.setJMenuBar(menuBar);

        JTextArea textArea = new JTextArea();
        frame.add(textArea, BorderLayout.CENTER);

        clearMenuItem.addActionListener(e -> textArea.setText(""));
        exitMenuItem.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}
