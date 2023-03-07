import java.awt.*;
import java.awt.event.*;


public class MenubarImpelemt extends Frame{

    MenuBar mb;
    MenuItem m ;
    MenuItem mI2;
    MenuItem m3;
    MenuItem m4;
    MenuItem mi ;
    MenuItem mi2;
    MenuItem mi3;
    MenuItem mi4;
    MenuItem mi5;
    String msg = "";

    public MenubarImpelemt(){

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });

        setSize(new Dimension(500,600));
        setVisible(true);
        setLocation(300,50);

        init();

        mi5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });

        Dialog d = new Dialog(MenubarImpelemt.this);
        d.setLayout(new BorderLayout());
        d.setSize(new Dimension(200,200));
        d.setLocation(this.getWidth()/2, this.getHeight()/2);
        Label l = new Label("Hello Pratyaksha");
        Button btn = new Button("Submit");
        d.add(l, BorderLayout.CENTER);
        d.add(btn, BorderLayout.SOUTH);
        d.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                d.dispose();
            }
        });
        

        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d.setVisible(true);
                
            }
        });

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                msg = "You are Genius";

                repaint();
            }
        });

    }

    public void init(){
        mb = new MenuBar();

        Menu m1 = new Menu("File");

         mi = new MenuItem("New File", new MenuShortcut(KeyEvent.VK_N));
         mi2 = new MenuItem("Open", new MenuShortcut(KeyEvent.VK_O));
         mi3 = new MenuItem("Save", new MenuShortcut(KeyEvent.VK_S));
         mi4 = new MenuItem("Save As", new MenuShortcut(KeyEvent.VK_SHIFT + KeyEvent.VK_S));
         mi5 = new MenuItem("Close", new MenuShortcut(KeyEvent.VK_X));

        m1.add(mi);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);
        m1.add(mi5);

        mb.add(m1);
        
        Menu m2 = new Menu("Edit");

        m = new MenuItem("Undo");
        mI2 = new MenuItem("Redo");
        m3 = new MenuItem("Cut");
        m4 = new MenuItem("Copy");

        m2.add(m);
        m2.add(mI2);
        m2.add(m3);
        m2.add(m4);

        mb.add(m2);

        setMenuBar(mb);
        
    }

    public void paint(Graphics g){
        g.drawString(msg, getWidth()/ 2, getHeight()/2);
    }
    
    public static void main(String[] args) {
        // MenubarImpelemt frame =  
        new MenubarImpelemt();

        
    }
}