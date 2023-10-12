import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Scanner;
public class RectsByMouseClickStoreInShapeArray extends JPanel {
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Line2D> d2Line;
    int xPoint[] = new int[1000];
    int yPoint[] = new int[1000];
    static int pooint;

    int index=0;
//    Graphics g;
//    Graphics2D d2Line = (Graphics2D) g;
    public RectsByMouseClickStoreInShapeArray() {
        rectangles = new ArrayList<>();//Initialize an ArrayList<Rectangle> named rectangles to store the drawn rectangles.
        d2Line = new ArrayList<>();

        // Create a mouse listener to handle mouse clicks
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX(); // Get the x-coordinate of the mouse click
                xPoint[index]=x;
                int y = e.getY(); // Get the y-coordinate of the mouse click
                yPoint[index]=y;
                int width = 70; // Width of the rectangle (adjust as needed)
                int height = 40; // Height of the rectangle (adjust as needed)
                Rectangle rect = new Rectangle(x, y, width, height); // Create a new Rectangle

                rectangles.add(rect); // Add the new Rectangle to the list
                index++;
                // Repaint the panel to display the new rectangle
                repaint();
            }
        }
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        int LiX = 0;
//        int LiY = 0;

        g.drawPolygon(xPoint,yPoint,pooint);
        // Draw all stored rectangles
//        for (Rectangle rect : rectangles) {
//            g.drawRect(rect.x, rect.y, rect.width, rect.height);
//        }
//        for (Rectangle rect : rectangles){
//            g.drawLine(LiX,LiY,rect.x, rect.y);
//            LiX = rect.x;
//            LiY = rect.y;
//        }
    }

    public static void main(String[] args) {
        System.out.println("input number of angles");
        Scanner input = new Scanner(System.in);
        pooint = input.nextInt();




        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Rectangles by Mouse Click");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new RectsByMouseClickStoreInShapeArray());
            frame.setSize(600, 400);
            frame.setVisible(true);
        });
    }
}