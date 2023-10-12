import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonChoiceForShapes extends JFrame implements ActionListener {
    private JRadioButton lineRadioButton;
    private JRadioButton rectangleRadioButton;
    private JRadioButton circleRadioButton;
    private JButton drawButton;
    private JPanel drawingPanel;

    private boolean drawLine = false;
    private boolean drawRectangle = false;
    private boolean drawCircle = false;
    public RadioButtonChoiceForShapes() {
        setTitle("RadioButton Choice for Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        // Create radio buttons
        lineRadioButton = new JRadioButton("Draw Line");
            lineRadioButton.addActionListener(this);

        rectangleRadioButton = new JRadioButton("Draw Rectangle");
        rectangleRadioButton    .addActionListener(this);

        circleRadioButton = new JRadioButton("Draw Circle");
        circleRadioButton    .addActionListener(this);

        // Create button group for radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(lineRadioButton);
        group.add(rectangleRadioButton);
        group.add(circleRadioButton);

        // Create drawing panel
        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (drawLine) {
                    g.drawLine(50, 50, 250, 50);
                }
                if (drawRectangle) {
                    g.drawRect(50, 100, 200, 100);
                }

                if (drawCircle){
                    g.fillOval(50,50,50,50);
                }
            }
        };

        // Create draw button
        drawButton = new JButton("Draw");

        drawButton.addActionListener(this);

        // Create layout for the frame
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lineRadioButton)
                        .addComponent(circleRadioButton)
                        .addComponent(rectangleRadioButton)
                        )
                //.addComponent(drawButton)
                .addComponent(drawingPanel));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(lineRadioButton)
                        .addComponent(circleRadioButton)
                        .addComponent(rectangleRadioButton)
                        )
                //.addComponent(drawButton)
                .addComponent(drawingPanel));

        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == lineRadioButton||e.getSource() == rectangleRadioButton|| e.getSource() == circleRadioButton) {
            drawLine = lineRadioButton.isSelected();
            drawRectangle = rectangleRadioButton.isSelected();
            drawCircle = circleRadioButton.isSelected();
            drawingPanel.repaint();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RadioButtonChoiceForShapes frame = new RadioButtonChoiceForShapes();
            frame.setVisible(true);
        });
    }
}
