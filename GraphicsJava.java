import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel{

    int x = 0, y = 0, stepSize = 10, width, height, ballWidth = 30, ballHeight = 30;

    public MyPanel(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void paint(Graphics g){

        super.paint(g);
        
        g.setColor(Color.blue);
        g.fillOval(x, y, 30, 30);

        if(x > width-50){ stepSize = - stepSize;}
        else if(x+5 < 0) stepSize = - stepSize;

        x = x+stepSize;
        y = y + 2*stepSize;

        

        try{
        Thread.sleep(50);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        repaint();
    }
}
public class GraphicsJava extends JFrame{

    public GraphicsJava(){
        setSize(new Dimension(600,700));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {

        GraphicsJava graph = new GraphicsJava();
        MyPanel panel = new MyPanel(graph.getWidth(), graph.getHeight());
        panel.setBackground(Color.black);
        graph.add(panel);
        
        graph.validate();
        graph.setVisible(true);


    }
}
