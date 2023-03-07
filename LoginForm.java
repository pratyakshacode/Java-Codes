import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame{
    private JLabel user;
    private JLabel pass;
    private JLabel textLabel;

    private JTextField username;
    private JPasswordField password;
    private JButton btn;
    private Container c;
    private JRadioButton radio1;
    private JRadioButton radio2;
    private JRadioButton radio3;
    private JTextArea text;
    private ButtonGroup bg;

    public LoginForm(){

        setSize(new Dimension(400,370));
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        // c.setBackground(Color.gray);

        user = new JLabel("Username : ");
        pass = new JLabel("Password : ");
        username = new JTextField();
        password = new JPasswordField();
        btn = new JButton("Login");
        radio1 = new JRadioButton("Male");
        radio2 = new JRadioButton("Female");
        radio3 = new JRadioButton("Others");
        text = new JTextArea();
        textLabel = new JLabel("Address : ");
        bg = new ButtonGroup();

        btn.setBackground(Color.lightGray);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        setLayout(null);

        user.setBounds(10,20, 80, 40);
        username.setBounds(100, 25, 150, 30);
        pass.setBounds(10, 60, 80, 40);
        password.setBounds(100, 65,  150, 30);
        radio1.setBounds(10, 100, 80, 20);
        radio2.setBounds(10, 125, 80, 20);
        radio3.setBounds(10, 150, 80,20);
        textLabel.setBounds(10, 190, 80, 30);
        text.setBounds(90, 180, 300, 70);
        btn.setBounds(50, 270, 81, 30);
        bg.add(radio1);
        bg.add(radio2);
        bg.add(radio3);

        c.add(user);
        c.add(username);
        c.add(pass);
        c.add(password);
        c.add(radio1);
        c.add(radio2);
        c.add(radio3);
        c.add(textLabel);
        c.add(text);
        c.add(btn);
        
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Your username is : " + username.getText());
                char[] ch;
                ch = password.getPassword();
                System.out.print("Your password is : ");
                for(var element : ch){
                    System.out.print(element);
                }
                System.out.println();
                String select;
                if(radio1.isSelected()) select = radio1.getText();
                else if(radio2.isSelected()) select = radio2.getText();
                else if(radio3.isSelected()) select = radio3.getText();
                else select = "Please choose your gender ";

                System.out.println("You are a : " + select);
                System.out.println("Your address is : " + text.getText());

            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        new LoginForm();
    }
}
