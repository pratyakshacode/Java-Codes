import javax.swing.*;
import java.awt.*;
public class Cards extends JFrame {

    JPanel major;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JButton next;
    JButton pre;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;


    public Cards(){
        setSize(new Dimension(450,550));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        //initializing the components
        init();

        //setting common properties to components
        setProps();

        //adding the components into the required components
        p1.add(l1);
        p2.add(l2);
        p3.add(l3);
        p4.add(l4);

        major.add(p1, "p1");
        major.add(p2, "p2");
        major.add(p3, "p3");
        major.add(p4, "p4") ;

        add(major);
        add(pre);
        add(next);
        
        setVisible(true);


    }
    public static void main(String[] args) {
        
        new Cards();
    }

    public void init(){

        //panels
        major = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        //buttons

        pre = new JButton("Previous");
        next = new JButton("Next");

        //labels

        l1 = new JLabel("panel 1");
        l2 = new JLabel("panel 2");
        l3 = new JLabel("panel 3");
        l4 = new JLabel("panel 4");


        
    }

    public void setProps(){

        major.setBounds(10,10,420, 450);
        major.setBackground(Color.lightGray);

        major.setLayout(new CardLayout());
        
        

        pre.setBounds(10,480, 100, 30);
        next.setBounds(120, 480, 100,30);

        p1.setBackground(Color.black);
    }
}
