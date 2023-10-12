

//import the necessary classes from the javax.swing and java.awt packages. 
import javax.swing.*;
import java.awt.*;

public class DrawGraphics extends JPanel { //the class DrawGraphics is defined, which extends the JPanel class.(DrawGraphics is a custom panel is used for drawing). 
    @Override
    protected void paintComponent(Graphics g) {  //paintComponent method is overridden to perform the drawing. 
        super.paintComponent(g);  //super.paintComponent(g) to ensure the panel's background is properly painted before drawing.

        /** the variable g refers to the graphics context that is used to draw on a graphical component,
         *such as a JPanel or a Graphics2D object.
         *(it provides methods to draw shapes, text, and images onto the associated graphical component)
         * like paintComponent(Graphics g) that requires a Graphics object as a parameter.
         **/

        // Draw a red line
        g.setColor(Color.RED);
        g.drawLine(50, 50, 200, 50);

        // Draw a blue line
        g.setColor(Color.BLUE);
        g.drawLine(50, 100, 200, 100);

        // Draw a green rectangle
        g.setColor(Color.GREEN);
        g.fillRect(50, 150, 150, 50);

        // Draw a yellow rectangle with black border
        g.setColor(Color.YELLOW);
        g.fillRect(50, 220, 150, 80);
        g.setColor(Color.BLACK);
        g.drawRect(50, 220, 150, 80);

        // Draw a cyan ellipse
        g.setColor(Color.CYAN);
        g.fillOval(50, 320, 150, 80);

        // Draw a magenta ellipse with black border
        g.setColor(Color.MAGENTA);
        g.fillOval(50, 420, 150, 80);
        g.setColor(Color.BLACK);
        g.drawOval(50, 420, 150, 80);


        int[] polygonX = {300, 250, 200, 150, 100};
        int[] polygonY = {200, 50, 100, 150, 100};

        int[] polylineX = {250, 300, 350, 400, 450};
        int[] polylineY = {100, 50, 100, 50, 100};

        // Draw a polygon using the points
        g.setColor(Color.orange);
        g.drawPolygon(polygonX, polygonY, 5);

        // Draw a polyline using the points
        g.setColor(Color.BLUE);
        g.drawPolyline(polylineX, polylineY, 5);

        //im gonna redo the stuff i did today

        //two circles
        g.setColor(Color.RED);
        g.drawOval(650, 400,200,200);
        //circle filled
        g.setColor(Color.ORANGE);
        g.fillOval(650, 200, 200,200);

        //triangle time
        int[] polyX = {300,600,600};
        int[] polyY = {400,400,550};
        g.setColor(Color.BLACK);
        g.drawPolygon(polyX,polyY,3);
    }

// the main method,

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Drawing Shapes");// A JFrame named frame is created to hold the graphics.
//        //this will create the window that has our things and will name it
//        DrawGraphics drawGraphics = new DrawGraphics();//An instance of the DrawGraphics panel is created.
//        frame.add(drawGraphics);//The panel is added to the fram.
//        frame.setSize(1280, 780);//The frame's size is setted.
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //The setDefaultCloseOperation--> the program terminates when the window is closed.
//        frame.setVisible(true);
//    }
}