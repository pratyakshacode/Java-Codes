import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{

    JTextPane value;
    JButton close;

    JButton clear;
    JButton add;
    JButton sub;
    JButton div;
    JButton mul;
    JButton equal;
    JButton mod;

    JPanel panel;

    public Calculator(){
        
        setSize(new Dimension(400,500));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        init();
        setProps();
        
        addComponent();




        setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }

    public void init(){

        clear = new JButton("C");
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("x");
        div = new JButton("/");
        mod = new JButton("%");
        equal = new JButton("=");
        panel = new JPanel();
        value = new JTextPane();
        close = new JButton("<-");
    }

    void addComponent(){

        panel.add(value);
        panel.add(clear);
        panel.add(add);
        panel.add(sub);
        panel.add(mul);
        panel.add(div);
        panel.add(mod);
        panel.add(equal);
        panel.add(close);

        
        add(panel);
    }

    void setProps(){
    panel.setLayout(null);
    value.setBounds(10,10,365,100);
    value.setBackground(Color.lightGray);
    value.setAlignmentX(JTextPane.CENTER_ALIGNMENT);
    }
}
