import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboboxImplement extends JFrame{

    private JComboBox box;
    private JButton btn;
    private JLabel label;
    String msg;

    public ComboboxImplement(){
        setSize(new Dimension(400,500));
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] arr = {"Java", "C++", "JavaScript", "Python", "Solidity"};
        box = new JComboBox<>(arr);
        btn = new JButton("Get Language");
        label = new JLabel();

        Container c = getContentPane();
        box.setBounds(50,50, 200, 30);

       

        
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                msg = "You have choosen " + box.getSelectedItem() + " present at -> " + box.getSelectedIndex() + '\n';
                label.setText(msg);
                msg.concat(msg);
                
            }
        });

        c.add(box);
        btn.setBounds(50,200,300,30);
        c.add(btn);
        label.setBounds(50, 250, 300, 30 );
        c.add(label);
        setVisible(true);


        
    }
    public static void main(String[] args) {
        new ComboboxImplement();
    }
}
