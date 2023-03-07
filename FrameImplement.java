import javax.swing.*;

public class FrameImplement {   
    
    static JLabel label;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        java.awt.Container c = frame.getContentPane();
        frame.setLayout(null);
        label = new JLabel("Hello World!");
        label.setBounds(frame.getWidth()/2, 10, 100,50);

    
        
        c.add(label);
        frame.setTitle("MyFrame");

        ImageIcon icon = new ImageIcon("logo.jpg");
        frame.setIconImage(icon.getImage());
        // frame.setResizable(false);
        frame.setVisible(true);


    }
}