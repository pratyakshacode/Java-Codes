import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TabbedPane extends JFrame {

    JTabbedPane pane;
    JPanel panel;
    JPanel pan;
    JPanel p;
    JLabel label1;
    JLabel label2;
    JLabel label3;


    public TabbedPane(){
        setSize(new Dimension(450,550));
        setLocationRelativeTo(null);
        setBackground(Color.lightGray);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        


        pane = new JTabbedPane();
        pane.setBounds(10,10,300,400);
        pane.setName("Name");

        panel = new JPanel();
        pan = new JPanel();
        p = new JPanel();

        label1 = new JLabel("Page 1");
        label2 = new JLabel("Page2");
        label3 = new JLabel("Page 3");

        panel.add(label1);
        pan.add(label2);
        p.add(label3);

        pane.add("Page 1",panel);
        pane.add("Page 2", pan);
        pane.add("Page 3", p);

        add(pane);

        setVisible(true);



    }
    public static void main(String[] args) {
        new TabbedPane();
    }

}
