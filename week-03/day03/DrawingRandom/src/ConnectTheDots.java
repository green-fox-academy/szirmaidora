import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        // public static void TheDots(Array<int> MyArray Graphics graphics) {
        //  graphics.drawLine(10,10,290,10);

        int[][] myArray1 = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] myArray2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        Connect(myArray1, graphics);
        Connect(myArray2, graphics);
    }


    public static void Connect(int[][] Dots, Graphics graphics) {

        for (int i = 0; i < Dots.length - 1; i++) {

            graphics.drawLine(Dots[i][0], Dots[i][1], Dots[i + 1][0], Dots[i + 1][1]);
        }
        graphics.drawLine(Dots[0][0], Dots[0][1], Dots[Dots.length - 1][0], Dots[Dots.length - 1][1]);

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