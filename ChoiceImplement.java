import java.awt.*;
import java.awt.event.*;

public class ChoiceImplement extends Frame {

    Choice ch;
    Choice extra;

    Button btn;

    public ChoiceImplement(){
        setSize(new Dimension(500,600));
        setLocation(200,100);
        setVisible(true);
        setBackground(Color.LIGHT_GRAY);

        setLayout(new GridLayout(6,1));

        ch = new Choice();
        btn = new Button("Submit choice");
        extra = new Choice();

        ch.add("Select");
        ch.add("Java");
        ch.add("C++");
        ch.add("Python");
        ch.add("Javascript");
        ch.add("Ruby");
        ch.add("Dart");

        add(ch);
        add(extra);
        add(btn);
        

    }

    public void paint(Graphics g){
        g.drawString("Hello", 100, 500);
    }

    
    public static void main(String[] args) {
     ChoiceImplement choice = new ChoiceImplement();

        // adding the window event to close window

        choice.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                choice.dispose();
            }
        });

        choice.ch.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){

                choice.extra.removeAll();
                
                if(choice.ch.getSelectedItem() == "Java"){
                    

                    choice.extra.add("Java awt");
                    choice.extra.add("Javax Swing");
                    choice.extra.add("JavaFX");
                    choice.extra.add("Android Development");
                    choice.extra.add("Web Development");
                }
                if(choice.ch.getSelectedItem() == "C++"){
                    

                    choice.extra.add("Competitive Programming");
                    choice.extra.add("Application Development");
                    choice.extra.add("C Graphics");
                }
                if(choice.ch.getSelectedItem() == "Javascript"){
                    

                    choice.extra.add("React");
                    choice.extra.add("Angular");
                    choice.extra.add("View");
                }
                if(choice.ch.getSelectedItem() == "Ruby"){
                    

                    choice.extra.add("Networking");
                    choice.extra.add("Learning");
                }
                if(choice.ch.getSelectedItem() == "Dart"){
                    

                    choice.extra.add("Flutter");
                }
                if(choice.ch.getSelectedItem() == "Python"){
                    

                    choice.extra.add("General Purpose");
                    choice.extra.add("AI/ML");
                    choice.extra.add("Application Development");
                    choice.extra.add("Web Development");
                }

                
            }
        });

        choice.btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String lang = choice.ch.getSelectedItem();
                String extra = choice.extra.getSelectedItem();

                System.out.println("You will learn " + lang + " for the " + extra);
                
            }
        });
    }
}
