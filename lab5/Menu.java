import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Menu 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("简单菜单窗口");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("文件");
        JMenu helpMenu = new JMenu("帮助");

        JMenuItem newItem = new JMenuItem("新建");
        JMenuItem openItem = new JMenuItem("打开");
        JMenuItem exitItem = new JMenuItem("退出");
        JMenuItem aboutItem = new JMenuItem("关于");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        exitItem.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}
