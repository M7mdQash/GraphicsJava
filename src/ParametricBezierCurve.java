/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class ParametricBezierCurve extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        int x0 = 50, y0 = 150;
        int x1 = 150, y1 = 50;


        for (int i = 0; i <= 100; i++) {
            float t = i / 100.0f;
            int x = (int) ((1 - t) * x0 + t * x1);
            int y = (int) ((1 - t) * y0 + t * y1);
            g2d.setColor(Color.red);
            g2d.drawLine(x, y, x, y);
        }


        int qx0 = 50, qy0 = 150;
        int qx1 = 75, qy1 = 75;
        int qx2 = 150, qy2 = 50;

        for (int i = 0; i <= 100; i++) {
            float t = i / 100.0f;
            //quad: p(t) = (1-t)^2 * p0 + 2t(1-t)*p1 + t^2*p2
            int x = (int) (Math.pow((1-t),2) * qx0 + 2*t*(1-t)*qx1 + Math.pow(t,2)*qx2);
            int y = (int) (Math.pow((1-t),2) * qy0 + 2*t*(1-t)*qy1 + Math.pow(t,2)*qy2);
            g2d.setColor(Color.GREEN);

            g2d.drawLine(x, y, x, y);
        }

        int cx0 = 50, cy0 = 150;
        int cx1 = 190, cy1 = 190;
        int cx2 = 0, cy2 = 0;
        int cx3 = 150, cy3 = 50;

        for (int i = 0; i <= 100; i++) {
            g2d.setColor(Color.blue);
            float t = i / 100.0f;
            int x = (int) ((1 - t) * (1 - t) * (1 - t) * cx0 + 3 * (1 - t) * (1 - t) * t * cx1 + 3 * (1 - t) * t * t * cx2 + t * t * t * cx3);
            int y = (int) ((1 - t) * (1 - t) * (1 - t) * cy0 + 3 * (1 - t) * (1 - t) * t * cy1 + 3 * (1 - t) * t * t * cy2 + t * t * t * cy3);
            g2d.drawLine(x, y, x, y);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Linear Bezier Curve");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ParametricBezierCurve());
            frame.setSize(400, 400);
            frame.setVisible(true);
        });
    }
}
