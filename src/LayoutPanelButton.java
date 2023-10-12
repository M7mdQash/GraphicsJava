import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;
import java.util.*;

public class LayoutPanelButton extends JFrame {

    private static final int FW = 400;
    private static final int FH = 300;

    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Button 4");

    public static void main(String[] args) {
        new LayoutPanelButton();
    }

    public LayoutPanelButton() {
        setSize(FW, FH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Layout Panel Button");
        setLocationRelativeTo(null);

        //layout of frame
        setLayout(new BorderLayout());

        // create panel called centerPanel
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.YELLOW);

        // create panel called southPanel
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.WHITE);
        southPanel.setLayout(new GridLayout(2, 2));

        // add buttons to southPanel panel
        southPanel.add(btn1);
        southPanel.add(btn2);
        southPanel.add(btn3);
        southPanel.add(btn4);

        // add the centerPanel panel to CENTER of frame
        add(centerPanel, BorderLayout.CENTER);
        // add the southPanel panel to SOUTH of frame
        add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
        //pack();
    }


}


