import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Editorpane extends JFrame{

JEditorPane pane = new JEditorPane();
JButton btn = new JButton("Click To Copy");

public Editorpane(){
    setSize(new Dimension(500,600));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pane.setContentType("text/html");

    setLocationRelativeTo(null);
    add(pane, BorderLayout.CENTER);
    add(btn, BorderLayout.PAGE_END);
    pane.setEditable(false);
    pane.setText(
        "<html>"
        + "<head><title> HEllo </title> </head>"
        + "<body> <div> <h1 color='blue'> Hello World </h1> </body> </html>"

    );
    
    btn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            pane.selectAll();
            pane.copy();
        }
    });

    setVisible(true);
}
    public static void main(String[] args) {
        new Editorpane();
    }
}
