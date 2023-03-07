import javax.swing.*;
import java.awt.*;

public class GetImage extends JFrame{

    JLabel label;
    JPanel panel;

    public GetImage(){
        setSize(new Dimension(600,600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ImageIcon img = new ImageIcon("myImage.jpeg");
        
        label = new JLabel(img);
        label.setBounds(10,10,100,100);
        panel = new JPanel();
        panel.add(label);
        add(panel);

        
        setVisible(true);
        validate();
    }
    public static void main(String[] args) {
        new GetImage();
    }
}
