import javax.swing.*;
import java.awt.*;
public class SplitPanel extends JFrame{

    JScrollPane pane;
    JTextArea text;

    public SplitPanel(){
        setSize(new Dimension(500,600));
        setLayout(null);
        setLocationRelativeTo(null);
        setBackground(Color.lightGray);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        text = new JTextArea();
        text.setLineWrap(true);

        pane = new JScrollPane(text, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pane.setBounds(10,10,300,400);

        add(pane);

        setVisible(true);

    }
    public static void main(String[] args) {
        new SplitPanel();
    }
}
