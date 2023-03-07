import java.awt.*;
import java.awt.event.*;


public class CheckboxImplement extends Frame {

    Checkbox ch1;
    Checkbox ch2;
    Checkbox ch3;
    Label l;
    Panel p1;
    Panel p2;
    Button btn;
    CheckboxGroup group;

    public CheckboxImplement(){

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });

        setSize(new Dimension(500,400));
        setLocation(500, 300);
        setVisible(true);
        setLayout(new BorderLayout());

        init();

        

        // setting the properties of the panels
        p1.setPreferredSize(new Dimension(500, 100));
        p1.setBackground(Color.gray);

        p2.setPreferredSize(new Dimension(300, 350));
        p2.setBackground(Color.LIGHT_GRAY);

        p1.add(l);

        p2.add(ch1);
        p2.add(ch2);
        p2.add(ch3);
        p2.add(btn);


        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);


        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                if(ch1.getState()){
                    System.out.println(ch1.getLabel());
                }
                
                if(ch2.getState()){
                    System.out.println(ch2.getLabel());
                }

                if(ch3.getState()){
                    System.out.println(ch3.getLabel());
                }
            }
        });
    }
    public static void main(String[] args) {
        
        CheckboxImplement check = new CheckboxImplement();

        check.ch1.addItemListener(new MyListener());
        check.ch2.addItemListener(new MyListener());
        check.ch3.addItemListener(new MyListener());


        

    }

    public void init(){

        group = new CheckboxGroup();

        ch1 = new Checkbox("Java", false, group);
        ch2 = new Checkbox("C++", false, group);
        ch3 = new Checkbox("Python",false, group);
        btn = new Button("Submit");
        l = new Label("Select Your Language");

        p1 = new Panel(new GridLayout(1,1));
        p2 = new Panel(new GridLayout(4,1));
    }
}

class MyListener implements ItemListener{
        public void itemStateChanged(ItemEvent e ){
            e.getSource();

            if(e.getStateChange() == 1)
                System.out.println(e.getItem());
        }
}
