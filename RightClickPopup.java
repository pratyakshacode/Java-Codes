import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RightClickPopup extends JFrame {

    JMenuItem item1; 
    JMenuItem item2;
    JMenuItem item3;
    JPopupMenu menu;

    public RightClickPopup(){
        setSize(new Dimension(400,500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        item1 = new JMenuItem("New");
        item2 = new JMenuItem("Folder");
        item3 = new JMenuItem("Refresh");

        menu = new JPopupMenu();
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        
        // menu.setLocation(50,50);
        this.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){

                if(e.getButton() == MouseEvent.BUTTON3){

                    int x = e.getX();
                    int y = e.getY();

                    menu.show(RightClickPopup.this, x, y);
                }
            }
        });

        item1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("New Clicked");
            }
        });
        item2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Folder Clicked");
            }
        });
        item3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Refresh Clicked");
            }
        });

        setVisible(true);

    }
    public static void main(String[] args) {
        new RightClickPopup();
    }


}
