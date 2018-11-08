import javax.swing.*;

import java.awt.*;

import static java.awt.Color.RGBtoHSB;
import static java.awt.Color.white;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)


        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
         for (int i = 0; i < 500; i++){
             int y = random(255);
             graphics.setColor(new Color(y,y,y));
             graphics.fillRect(random(320), random(320),random(3), random(3));


         }


    }
    public static Integer random (int x) {
        int random = (int) (Math.random()*x);
        return random;
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setBackground(Color.black);
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