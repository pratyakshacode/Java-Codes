import java.awt.Frame;
import java.awt.*;
 
 public class JavaFrame extends Frame{
    public static void main(String[] args) {
        
        Frame frame = new Frame();
        frame.setSize(500,500);
        frame.setVisible(true);

        TextField field = new TextField("Hello World");
        frame.setLayout(new FlowLayout());
        frame.add(field);
        


    }   
}