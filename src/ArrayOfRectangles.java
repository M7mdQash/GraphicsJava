

//import the necessary classes from the javax.swing and java.awt packages. 
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class ArrayOfRectangles extends JPanel { //the class DrawGraphics is defined, which extends the JPanel class.(DrawGraphics is a custom panel is used for drawing). 
    private final int numRectangles = 5;
    private final int rectWidth = 50;
    private int rectHeight = 30;
    private final int spacing = 20;
    private final int initialX = 100;
    private final int initialY = 100;

    //transform data
    private final int translationX = 200;
    private final int transtaltionY = -100;
    //lab4 stuff

    private Polygon polygon;
    public ArrayOfRectangles() {
        int[] polyX = {100, 200, 300, 250, 150};
        int[] polyY = {100, 200, 100, 50, 50};
        polygon = new Polygon(polyX, polyY, 5);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //============================lab3=================================
        //polygon making
        Shape polyroly = new Polygon();

        AffineTransform polyTrans = new AffineTransform();
        //makin normal poly
        g2d.setColor(Color.BLUE);
        g2d.fillPolygon(polygon);
        //casting
        AffineTransform translation = new AffineTransform();
        translation.translate(500, 700);
        g2d.setTransform(translation);
        g2d.setColor(Color.RED);
        g2d.fillPolygon(polygon);
        // Scaling
        AffineTransform scaling = new AffineTransform();
        scaling.scale(0.5, 2);
        g2d.setTransform(scaling);
        g2d.setColor(Color.GREEN);
        g2d.fillPolygon(polygon);
        // Rotation
        AffineTransform rotation = new AffineTransform();
        rotation.setToRotation(15 * Math.PI / 180);
        g2d.setTransform(rotation);
        g2d.setColor(Color.YELLOW);
        g2d.fillPolygon(polygon);
        //============================lab 4================================
        //square time
//        g2d.setColor(Color.BLUE);
//        g2d.fillRect(initialX,initialY,rectWidth,rectHeight);
//
//        //affinite translation
//        AffineTransform trans = new AffineTransform();
//        trans.translate(translationX,transtaltionY);
//
//        //applying transslation
//        g2d.setColor(Color.red);
//        g2d.setTransform(trans);
//        g2d.fillRect(initialX,initialY,rectWidth,rectHeight);
//
//        //scaling
//        AffineTransform Scale = new AffineTransform();
//        Scale.scale(0.5, 2);
//        //drawing scaling
//        g2d.setColor(Color.GREEN);
//        g2d.setTransform(Scale);
//        g2d.fillRect(initialX,initialY,rectWidth,rectHeight);
//        //rotato
//        AffineTransform rotato = new AffineTransform();
//        double angle = 15;
//        rotato.setToRotation(Math.toRadians(angle));
//        //rotation drawing
//        g2d.setColor(Color.yellow);
//        g2d.setTransform(rotato);
//        g2d.fillRect(initialX,initialY,rectWidth,rectHeight);
//        Shape polyRoly = new Polygon(polyx,polyY,5);
//        g.drawPolygon();
    //=================================previous lab2=====================================
//        g.setColor(Color.red);
//        g.drawLine(0,300,600,300);
//
//        g.drawLine(300,0,300,600);
//
//        g.setColor(Color.BLUE);
//        g.drawRect(150,200,300,200);
//
//        int panelWidth = getWidth();
//        int y = 30;
//        for (int row = 0; row < 5; row++) {
//            for (int i = 0; i < numRectangles; i++) {
//                int x = (i * (rectWidth + spacing)) + (panelWidth - (numRectangles * (rectWidth + spacing))) / 2;
//
//                if (row % 2 ==0) {
//                    g.setColor(Color.BLUE);
//                }else {
//                    g.setColor(Color.GREEN);
//                }
//                g.fillRect(x, y, rectWidth, rectHeight);
//
//            }
//
//            y += rectHeight+ 50;//the 50 gives the blank while the height changes the y coord
//        }
    }

// the main method,

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Shapes");// A JFrame named frame is created to hold the graphics.
        ArrayOfRectangles drawGraphics = new ArrayOfRectangles();//An instance of the DrawGraphics panel is created.
        frame.add(drawGraphics);//The panel is added to the fram.
        frame.setSize(1080, 1080);//The frame's size is setted.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//The setDefaultCloseOperation--> the program terminates when the window is closed.
        frame.setVisible(true);
    }
}