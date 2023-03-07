import java.awt.*;
import java.awt.event.*;

public class FrameMaking extends Frame{
    public FrameMaking(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){
        g.drawLine(20, 40, 100, 90);
        g.drawRect(20, 40, 100, 90);
        g.fillRect(80, 200, 100, 90);
        
        int xpoints[]={20,200,20,200,20};
        int ypoints[]={450,450,650,650,450}, num = 5;

        g.drawPolygon(xpoints, ypoints, num);
        g.draw3DRect(50, 300, 100, 90, true);
    }
    public static void main(String[]args){
        FrameMaking frame = new FrameMaking();
        frame.setSize(new Dimension(370,700));
        frame.setVisible(true);
        
    }
}