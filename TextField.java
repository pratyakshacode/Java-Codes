import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.awt.Component;

public class TextField extends JFrame {
    JLabel label;
    JLabel passLabel;

    JTextField field;
    JPasswordField pass;
    JButton btn;

    public TextField(){
        setBounds(500,20,500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,1));
        
        label = new JLabel("Username");
        btn = new JButton();
        btn.setText("Login");
        field = new JTextField();
        pass = new JPasswordField();
        passLabel = new JLabel("Password");

        Container c = getContentPane();

        // label.setBounds(50,50,60,50);
        c.add(label);
        c.add(field);
        c.add(passLabel);
        c.add(pass);
        c.add(btn);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // field.setBounds(120,50,100,30);
        pass.setEchoChar('*');
        

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Your name is : " + field.getText());
                char[] ch;
                ch=pass.getPassword();

                System.out.println("You have entered the password as : ");
                for(var element : ch){
                    System.out.print(element);
                }

            }
        });
        
        setVisible(true);
    }

   
    public static void main(String[] args) {
        new TextField();
    }
}
