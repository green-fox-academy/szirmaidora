import javax.swing.*;

import java.awt.*;

import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class graphic {

    // neeeeeeemjooooooooo

    public static void mainDraw(Graphics graphics) {
        recursion(8, graphics);


    }

    public static void drawSquareLines(int size, Graphics graphic) {
        graphic.drawRect(0, 0, HEIGHT / size, WIDTH / size);
        graphic.drawLine(HEIGHT / 3 / size, 0, HEIGHT / 3 / size, 320);
        graphic.drawLine(HEIGHT - HEIGHT / 3 / size, 0, HEIGHT - HEIGHT / 3 / size, 320);
        graphic.drawLine( 0, HEIGHT / 3 / size, 320, HEIGHT / 3 / size);
        graphic.drawLine(0, HEIGHT - HEIGHT / 3 / size, 320, HEIGHT - HEIGHT / 3 / size);


    }

    public static void drawSquare(int size ,Graphics graphic) {
        graphic.drawRect(0 , 0, HEIGHT / size / 3, WIDTH / size / 3);
    }

    public static int recursion(int n, Graphics graphic) {
        if (n == 0) {
            return n;

        } else {
            if (n % 2 == 0) {
                drawSquare(n, graphic);
                return recursion(n - 1, graphic);
            } else {
                drawSquareLines(n, graphic);
                return recursion(n - 1, graphic);
            }

        }

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