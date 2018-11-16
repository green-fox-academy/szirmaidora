import javax.swing.*;

import java.awt.*;

import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class graphic {

    // neeeeeeemjooooooooo

    public static void mainDraw(Graphics graphics) {
        recursion(WIDTH, 0, 0,  graphics);



    }






    public static void recursion (int size, int x, int y, Graphics graphics) {
        if (size <=0) {
            return;
        } else {
            graphics.drawRect(x , y, size, size);
        graphics.drawRect( x + size / 3, y, size / 3, size / 3);
        graphics.drawRect(x + size / 3,  y + size / 3 * 2, size / 3, size / 3);
        graphics.drawRect(x, y + size / 3, size / 3, size / 3);
        graphics.drawRect(x + 2 * size / 3, y + size / 3, size / 3, size / 3);


        recursion(size / 3, x + size / 3, y, graphics);
        recursion(size / 3,x + size / 3, y + size / 3 * 2, graphics);
        recursion(size / 3, x, y + size / 3, graphics);
        recursion(size / 3, x + size / 3 * 2, y + size / 3, graphics);

        return;}
    }

/*
    public static int recursion(int n, Graphics graphic) {
        if (n == 0) {
            return n;

        } else {
            if (n % 2 == 0) {
                drawSquare(n, graphic);
                return recursion(n - 1, graphic);
            } else {
                drawSquare(n, graphic);
                return recursion(n - 1, graphic);
            }

        }

    }
*/


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