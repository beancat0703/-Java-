import javax.swing.*;
import java.awt.BorderLayout;

public class BorderLayoutPractice
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton center = new JButton("Center");

        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);

        north.addActionListener(e -> 
        {
            System.out.println("该按钮位于北部");
        });
        south.addActionListener(e -> 
        {
            System.out.println("该按钮位于南部");
        });
        east.addActionListener(e -> 
        {
            System.out.println("该按钮位于东部");
        });
        west.addActionListener(e -> 
        {
            System.out.println("该按钮位于西部");
        });
        center.addActionListener(e -> 
        {
            System.out.println("该按钮位于中部");
        });

        frame.setVisible(true);
    }
}
