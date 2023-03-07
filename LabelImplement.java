import javax.swing.*;
import java.awt.*;

public class LabelImplement extends JFrame{
    JLabel textLabel;
    JLabel imageLabel;
    JLabel label;

    public LabelImplement(){

        setSize(500,600);
        setLocation(500,50);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textLabel = new JLabel("Hello World!");
        textLabel.setBounds(10,10,200, 60);

        ImageIcon icon = new ImageIcon("logo.jpg");
        imageLabel = new JLabel(icon);

        imageLabel.setBounds(20,20,200, 100);
        textLabel.setFont(new Font("Lucida Console", Font.PLAIN, 30));

        Container c = getContentPane();
        c.setBackground(Color.LIGHT_GRAY);
        c.add(textLabel);
        c.add(imageLabel);
        

        setVisible(true);

    }
    public static void main(String[] args) {
        new LabelImplement();
    }
}
