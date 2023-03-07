import java.awt.*;
import java.awt.event.*;
public class BorderLayoutImp extends Frame{

    Panel p1;
    Panel p2;
    Panel p3;
    Panel p4;
    Panel p5;

    public BorderLayoutImp(){

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("closing the window");
                dispose();
            }
        });
        setSize(new Dimension(400,500));
        setVisible(true);

        setLayout(new BorderLayout());

        p1 = new Panel();
        p1.setPreferredSize(new Dimension(200,200));
        p1.setBackground(Color.BLACK);
        p2 = new Panel();
        p2.setPreferredSize(new Dimension(200,500));
        p2.setBackground(Color.BLUE);
        p3 = new Panel();
        p3.setPreferredSize(new Dimension(200, 500));
        p3.setBackground(Color.GREEN);
        p4 = new Panel();
        p4.setPreferredSize(new Dimension(100,100));
        p4.setBackground(Color.LIGHT_GRAY);
        p5 = new Panel();
        p5.setBackground(Color.PINK);
        p5.setPreferredSize(new Dimension(100,100));

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.EAST);
        add(p3, BorderLayout.WEST);
        add(p4, BorderLayout.NORTH);
        add(p5, BorderLayout.SOUTH);

        p1.add(new TextField("Hello There"));
        p1.add(new Button("Click me"));


    }

    public static void main(String[] args) {
        new BorderLayoutImp();

    }
}