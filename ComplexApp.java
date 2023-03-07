import javax.swing.*;
import java.awt.*;


public class ComplexApp extends JFrame{

    JPanel panel;
    JPanel firstPanel;
    JPanel lastPanel;
    JPanel nextPanel;
    JPanel prePanel;

    JLabel fLabel;
    JLabel lLabel;
    JLabel nLabel;
    JLabel preLabel;

    JButton first;
    JButton last;
    JButton next;
    JButton previous;

    public ComplexApp(){

        setSize(new Dimension(600,600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new CardLayout());
        panel.setBackground(Color.lightGray);
        
        init();

        firstPanel.setBackground(Color.white);

        panel.add(fLabel, "first");
        panel.add(lLabel, "last");
        panel.add(nLabel, "next");
        panel.add(preLabel, "previous");
        

        add(panel, BorderLayout.CENTER);
        add(first, BorderLayout.SOUTH);
        add(last, BorderLayout.SOUTH);
        add(next, BorderLayout.SOUTH);
        add(previous, BorderLayout.SOUTH);

    }
    public static void main(String[] args) {
        
        new ComplexApp();
    }

    void init(){

        firstPanel = new JPanel();
        lastPanel = new JPanel();
        nextPanel = new JPanel();
        prePanel = new JPanel();

        first =  new JButton("First");
        last = new JButton("Last");
        next = new JButton("Next");
        previous = new JButton("Previous");

        fLabel = new JLabel("first");
        lLabel = new JLabel("last");
        nLabel = new JLabel("next");
        preLabel = new JLabel("previous");
    }
}
