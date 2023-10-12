/*
* 3 requirements:-
* screen saver behavoiur of rect: slovable by reversing velocity of animation
* dynamic frame: solvable by getting the frame from actionPerformed method exculisvly
* change color when borders are hit: use a method and array that changes when borders are hit
* set it in the actionPermformed method and make it void, be sure to init the color in the other
* methods to something in the color array
* */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class RectangleAnimation extends JPanel implements ActionListener {
    private int x = 0; // Initial x-coordinate of the rectangle
    private int y = 0; // Initial y-coordinate of the rectangle
    private int rectWidth = 50;
    private int rectHeight = 30;

    //deleted the init of frame to put it in a place where it could change dynamicly

    private int dx = 6; // Horizontal velocity
    private int dy = 6; // Vertical velocity
    private Timer timer;
    //stuff to change color
    private Color[] colors = {Color.red, Color.green, Color.BLUE};
    private int colorindex = 0;
    private Color currentColor;
    public RectangleAnimation(int frameWidth, int frameHeight) {

        timer = new Timer(10, this); // 10ms delay, calls actionPerformed method
        timer.start();
        currentColor = colors[colorindex];
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(currentColor);
        g.fillRect(x, y, rectWidth, rectHeight);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the position of the rectangle
        //using the velocity variables
        x += dx;
        y += dy;
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        //we put the frame length here to make it so it cahnges dynamically
        // Check if the rectangle has reached the boundaries
        if (x + rectWidth >= frameWidth || x<0 ) {
            //sets the x and y coords to the begining
            dx = -dx;
            changeColor();
        }
        if (y + rectHeight >= frameHeight || y<0){
            //revesrse y velocity indivusalyy
            dy = -dy;
            changeColor();
        }

        repaint(); // Repaint the JPanel to show the updated rectangle position
    }

    private void changeColor() {//this method changes the color of the rect using an array
        // Change color in the order: red, blue, green
        colorindex = (colorindex + 1) % colors.length;
        currentColor = colors[colorindex];
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Animation");
        int frameWidth = 400;
        int frameHeight = 400;

        RectangleAnimation animation = new RectangleAnimation(frameWidth, frameHeight);
        frame.add(animation);

        frame.setSize(frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
