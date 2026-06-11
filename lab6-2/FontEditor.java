import javax.swing.*;
import java.awt.*;

public class FontEditor 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("字体样式编辑器");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("宋体", Font.PLAIN, 20));
        frame.add(textArea);

        JCheckBox setBold = new JCheckBox("粗体");
        JCheckBox setItalic = new JCheckBox("斜体");

        setBold.addActionListener(e ->
            {
                int style = Font.PLAIN;
                if (setBold.isSelected())
                {
                    style |= Font.BOLD;
                }
                if (setItalic.isSelected())
                {
                    style |= Font.ITALIC;
                }
                Font currentFont = textArea.getFont();
                textArea.setFont(new Font(currentFont.getFontName(), style, currentFont.getSize()));
            }
        );
        frame.add(setBold);

        setItalic.addActionListener(e ->
            {
                int style = Font.PLAIN;
                if (setBold.isSelected())
                {
                    style |= Font.BOLD;
                }
                if (setItalic.isSelected())
                {
                    style |= Font.ITALIC;
                }
                    Font currentFont = textArea.getFont();
                    textArea.setFont(new Font(currentFont.getFontName(), style, currentFont.getSize()));
            }
        );
        frame.add(setItalic);

        JButton reset = new JButton("重置");
        reset.addActionListener(e ->
            {
                setBold.setSelected(false);
                setItalic.setSelected(false);
                textArea.setFont(new Font("宋体", Font.PLAIN, 20));
            }
        );
        frame.add(reset);

        frame.setVisible(true);
    }
}
