import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogBoxes extends JFrame implements ActionListener{

    JPanel panel;
    JButton btn;
    JButton btn2;
    JButton btn3;

    public DialogBoxes(){
        setSize(new Dimension(400,500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        btn = new JButton("Input");
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn2 = new JButton("Message");
        btn2.setFocusPainted(false);
        btn3 = new JButton("Confirm");
        btn3.setFocusPainted(false);
        panel = new JPanel();
        panel.setBounds(0,0,200,200);
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);

        btn.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        add(panel);
        setVisible(true);

    }
    public static void main(String[] args) {
        new DialogBoxes();

    }

    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == btn){
            String str = JOptionPane.showInputDialog(this, "Enter your name : ");
            System.out.println(str);
        }
        else if(e.getSource() == btn2){
            JOptionPane.showMessageDialog(this, "Hello There", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            int val = JOptionPane.showConfirmDialog(this, "Are you sure", "Exit From App", JOptionPane.YES_NO_OPTION);

            if(val == JOptionPane.YES_OPTION){
                dispose();
            }
            if(val == JOptionPane.NO_OPTION){
                System.out.println("No Option Clicked");
            }
        }
    }
}
