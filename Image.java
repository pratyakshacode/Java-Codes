import javax.swing.*;
import java.awt.*;

public class Image extends JFrame{

    JLabel label;

    public Image(){
        setSize(new Dimension(600,700));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ImageIcon img = new ImageIcon(getClass().getResource("logo.jpg"));
        
        label = new JLabel(img);

        setLayout(new FlowLayout());

        add(label);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Image();

    }
}
