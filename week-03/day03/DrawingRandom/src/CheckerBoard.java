import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int width = 40;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {


                Checker(2 * j * width, i * 2 * width, width, graphics);
                Checker(width + i * 2 * width, width + j * 2 * width, width, graphics);
            }
        }



    }
    public static void Checker (int a, int b, int c, Graphics graphics) {
        graphics.setColor(new Color(0,0,0));
        graphics.fillRect(a,b,c,c);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}