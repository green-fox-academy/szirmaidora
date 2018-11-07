import javax.swing.*;

import java.lang.Math;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        for (int i = 0; i < 4; i++) {


       // (int) (Math.random()*100);
        int rand = (int) (Math.random()*320);
        int rand2 = (int) (Math.random()*320);
        int rand3 = (int) (Math.random()*100);
        int rand4 = (int) (Math.random()*100);
        int color = (int) (Math.random() * 255);

        graphics.setColor(new Color(color));
        graphics.fillRect(rand, rand2, rand3, rand4);}


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