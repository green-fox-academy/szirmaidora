import javax.swing.*;

import java.awt.*;

import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.





        /*Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        int color = scanner2.nextInt();*/

        for (int i = 0; i<3; i++) {

            int size = (int) (Math.random() *320);
            int random1 = (int) (Math.random() *255);

        Rainbow (160-(size/2), 160-(size/2), size, random1, graphics);}

    }

    public static void Rainbow (int x, int y, int z, int color, Graphics graphics) {
        graphics.setColor(new Color(color));
        graphics.fillRect(x,y,z,z);
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