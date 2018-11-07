import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

        int a = 10;
        int b = 10;

        for (int i = 1; i < 7; i++) {
            Steps(a, b, i , graphics);
            a = 10 * i + a;
            b = 10 * i + b;


        }
    }

        public static void Steps (int a, int b, int c, Graphics graphics) {
            graphics.setColor(new Color(147,112,219));
            graphics.fillRect(a, b, 10*c, 10*c);
            graphics.setColor(new Color(0,0,0));
            graphics.drawRect(a, b, 10*c, 10*c);
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
