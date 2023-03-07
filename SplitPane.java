import javax.swing.*;
import java.awt.Dimension;


public class SplitPane extends JFrame{

    JSplitPane pane;
    JPanel panel;
    JPanel pan;
    JLabel lab;
    JLabel label;


    public SplitPane(){
        setSize(new Dimension(400,500));
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        panel = new JPanel();
        pan = new JPanel();

        lab = new JLabel("label1");
        label = new JLabel("label2");
        
        panel.add(lab);
        pan.add(label);

        pane.setBounds(10,10,300,400);

        pane.setTopComponent(panel);
        pane.setBottomComponent(pan);
        pane.setDividerLocation(150);

        add(pane);

        setVisible(true);





    }
    public static void main(String[] args) {
        new SplitPane();
    }
}
