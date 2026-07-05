import javax.swing.*;

public class MenuBarMenuItem {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu menu = new JMenu("大一下");
        menuBar.add(menu);

        JMenuItem menuItem = new JMenuItem("Java");
        menu.add(menuItem);

        frame.setVisible(true);
    }
}
