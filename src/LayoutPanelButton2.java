
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;
import java.util.*;

public class LayoutPanelButton2 extends JFrame {

    private static final int FW = 400;
    private static final int FH = 300;

    
    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    
    JRadioButton lineRB = new JRadioButton("Line", true);
    JRadioButton rectRB = new JRadioButton("Rectangle");

    public static void main(String[] args) {
        new LayoutPanelButton2();
    }

    public LayoutPanelButton2() {
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
        southPanel.setLayout(new GridLayout(1, 2));      

        // add buttons to southPanel panel
        southPanel.add(btn1);
        southPanel.add(btn2);        
       
        // create panel called chooseShapePanel
        JPanel chooseShapePanel = new JPanel();
        chooseShapePanel.setBackground(Color.WHITE);
        chooseShapePanel.setLayout(new GridLayout(2, 1));
        
        chooseShapePanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Shapes"));
        
        
                 
        //Create a button group and add buttons
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(lineRB);
        bgroup.add(rectRB);

        // add buttons to chooseShapePanel panel
        chooseShapePanel.add(lineRB);
        chooseShapePanel.add(rectRB);         	
        
        add(centerPanel, BorderLayout.CENTER);  
        add(southPanel, BorderLayout.SOUTH);
        add(chooseShapePanel, BorderLayout.WEST);
        setVisible(true);
        //pack();
    }


}
