import java.awt.*;
import javax.swing.*;

public class InternalFrame extends JFrame{
    JInternalFrame frame;
    JLabel label;
    JDesktopPane pane;

    public InternalFrame(){
        setSize(new Dimension(500,600));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pane = new JDesktopPane();
        label = new JLabel("Label");
        frame = new JInternalFrame("Internal Frame", true, true, true, true);
        frame.setSize(new Dimension(200,300));
        frame.setLayout(new FlowLayout());
        frame.add(label);
        add(pane);

        frame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);

        pane.add(frame);
        frame.setVisible(true);

        setVisible(true);
        
    }
    public static void main(String[] args) {
        new InternalFrame();
    }
}
