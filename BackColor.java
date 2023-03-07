// import java.awt.Frame;
import java.awt.event.*;
import java.awt.*;

public class BackColor {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.utility();
        System.out.println("frame size : " + frame.getSize());
        System.out.println("frame inset size : " + frame.getInsets());
        
    }
}

class MyFrame extends Frame {

    private TextField text;
    private TextField text2;
    private TextField text3;

    public MyFrame(){
       addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
       });
        
        setSize(new Dimension(500,500));
        setVisible(true);
        setBackground(Color.magenta);

        text = new TextField("This is my field");
        text2 = new TextField("This is the second text field");
        text3 = new TextField("This is the third text field");
        
        setLayout(new FlowLayout(FlowLayout.LEFT, 50,70));
        //adding the text fields into our frame
        setLocation(300, 200);
        add(text);
        add(text2);
        add(text3);

        
    }

    public void utility(){

        System.out.println(text.getText());
        text.setText("This is the new text for the field");
        System.out.println(text.isEditable());
        text.setEditable(false);
        System.out.println(text.isEditable());
        System.out.println("text : " + text.getText());
        System.out.println("text2 : " + text2.getText());
        System.out.println("text3 : " + text3.getText());

    }


}
