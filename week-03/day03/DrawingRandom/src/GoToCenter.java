import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.



        for (int i = 0; i < 3; i++) {

          //  Scanner scanner = new Scanner(System.in);
          //  int x = scanner.nextInt();
          //  Scanner scanner2 = new Scanner(System.in);
          //  int y = scanner2.nextInt();
            int x = (int) (Math.random() *320);
            int y = (int) (Math.random() *320);

            graphics.drawLine(x, y, 160, 160);


        }

    }
   // public static void ToCenter (int x, int y) {
   //     graphics.drawLine(x,y,160,160);
    //}

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