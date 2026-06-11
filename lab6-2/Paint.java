import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Paint
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("鼠标涂鸦版");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        PaintPanel paintPanel = new PaintPanel();
        frame.add(paintPanel, BorderLayout.CENTER);

        JButton clearButton = new JButton("清除画板");
        clearButton.addActionListener(e -> paintPanel.clear());

        JPanel btnPanel = new JPanel();
        btnPanel.add(clearButton);
        frame.add(btnPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    static class PaintPanel extends JPanel {
        private final ArrayList<ArrayList<Point>> allStrokes = new ArrayList<>();

        public PaintPanel() {
            setBackground(Color.WHITE);

            MouseAdapter mouseHandler = new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    ArrayList<Point> newStroke = new ArrayList<>();
                    newStroke.add(e.getPoint());
                    allStrokes.add(newStroke);
                    repaint();
                }

                @Override
                public void mouseDragged(MouseEvent e) {
                    if (!allStrokes.isEmpty()) {
                        ArrayList<Point> currentStroke = allStrokes.get(allStrokes.size() - 1);
                        currentStroke.add(e.getPoint());
                        repaint();
                    }
                }
            };

            addMouseListener(mouseHandler);
            addMouseMotionListener(mouseHandler);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.BLACK);
            g2d.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

            for (ArrayList<Point> stroke : allStrokes) {
                for (int i = 0; i < stroke.size() - 1; i++) {
                    Point p1 = stroke.get(i);
                    Point p2 = stroke.get(i + 1);
                    g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
        }

        public void clear() {
            allStrokes.clear();
            repaint();
        }
    }
}