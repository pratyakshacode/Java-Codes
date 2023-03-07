import java.awt.*;
import java.awt.event.*;

public class LabelsImpelement extends Frame {

    Label l1;
    Label l2;
    TextField t1;
    TextField t2;
    Button btn;

    public LabelsImpelement(){

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        
        setSize(new Dimension(550,500));
        setVisible(true);
        setLayout(new BorderLayout());

        l1 = new Label("Email");
        l2 = new Label("Password");
        btn = new Button("Submit");
        t1 = new TextField(20);
        t2 = new TextField(20);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("clicked on the button");
            }
        });

    }
    public static void main(String[] args) {
      new LabelsImpelement();

        
       


    }
}


