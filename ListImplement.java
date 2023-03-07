import java.awt.*;
import java.awt.event.*;


public class ListImplement extends Frame{

    List list;
    Button btn;

    public ListImplement(){

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });

        setSize(new Dimension(500,600));
        setLocation(200,100);
        setVisible(true);
        setBackground(Color.LIGHT_GRAY);

        setLayout(new BorderLayout());
        list = new List(3, true);

        list.add("Java");
        list.add("C++");
        list.add("Javascript");
        list.add("Ruby");
        list.add("Dart");
        list.add("Python");

        btn = new Button("Submit");

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String[] arr = list.getSelectedItems();
                
                for(String element : arr){
                    System.out.println(element);
                }
    
            }
        });

        add(list, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);



        

    }
    public static void main(String[] args) {
        new ListImplement();
    }
}
