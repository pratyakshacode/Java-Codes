import javax.swing.*;

import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.*;


public class MenubarImplement extends JFrame implements ActionListener, ItemListener{
    JMenuBar menubar;
    JMenu file, edit, wrap, Fonts, theme;
    JMenuItem n, save, cut, copy, paste, select, open;
    JComboBox<String> combo, fontSize;
    JCheckBoxMenuItem wordwrap, bold, italic,light, dark;
    JTextArea text;

    public MenubarImplement(){
        setSize(new Dimension(580,680));
        setLocationRelativeTo(null);
        // setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mini Pad");
        
        init();

        setJMenuBar(menubar);
        // text.setBounds(5,10,350,450);
        add(text);

        

        setVisible(true);

    }
    public static void main(String[] args) {
        new MenubarImplement();
    }
    public void init(){
        menubar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        n = new JMenuItem("New");
        cut = new JMenuItem("Cut");
        save = new JMenuItem("Save");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        select = new JMenuItem("Select");
        open = new JMenuItem("Open");
        Fonts = new JMenu("Fonts");
        theme = new JMenu("Theme");
        light = new JCheckBoxMenuItem("light");
        dark = new JCheckBoxMenuItem("dark");

        wordwrap = new JCheckBoxMenuItem("Word Wrap");
        String [] fonts = {"Arial", "Candara","Calibri", "Cambria", "Consolas", "Dubai", "Comic Sans MS", "Constantia", "Ebrima","Franklin Gothic Medium", "Georgia", "Impact", "Ink Free", "Marlett",  "Lucida Console", "Stencil"};
        combo = new JComboBox<>(fonts);
        combo.setMaximumRowCount(5);
        String [] arr = {"12","14","16","18","20","22","28","36","48"};
        fontSize = new JComboBox<>(arr);
        
        bold = new JCheckBoxMenuItem("Bold");
        italic = new JCheckBoxMenuItem("Italic");
        theme.add(light);
        theme.add(dark);

        file.add(n);
        file.add(save);
        file.add(open);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(select);
        wrap = new JMenu("Word Wrap");
        wrap.add(wordwrap);

        
        Fonts.add(bold);
        Fonts.add(italic);




        text = new JTextArea();

        menubar.add(file);
        menubar.add(edit);
        menubar.add(wrap);
        menubar.add(Fonts);
        menubar.add(combo);
        menubar.add(fontSize);

        n.addActionListener(this);
        save.addActionListener(this);
        open.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        copy.addActionListener(this);
        select.addActionListener(this);
        wordwrap.addItemListener(this);
        bold.addItemListener(this);
        italic.addItemListener(this);
        combo.addItemListener(this);
        fontSize.addItemListener(this);
        dark.addActionListener(this);
        light.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == n){
            text.setText("");
        }
        else if(e.getSource() == open){
            text.setText("Currently Unavailable");
        }
        else if(e.getSource() == save){
            text.setText("Currently Unavailable");
        }
        else if(e.getSource() == cut){
            text.selectAll();
            text.cut();
        }
        else if(e.getSource() == copy){
            text.selectAll();
            text.copy();
        }
        else if(e.getSource() == paste){
            text.paste();
        }
        else if(e.getSource() == select){
            text.selectAll();
        }
        else if(e.getSource() == dark){
            text.setBackground(Color.darkGray);
            text.setForeground(Color.white);
            
        }
        
        
    }

    public void itemStateChanged(ItemEvent e){

        if(e.getSource() == wordwrap){
            text.setLineWrap(!text.getLineWrap());
        }
        else if (e.getSource() == bold){
            if(((JCheckBoxMenuItem) e.getSource()).isSelected()){
            italic.setSelected(false);
            text.setFont(new Font("Arial", Font.BOLD, 13));
            }
            else if(!((JCheckBoxMenuItem) e.getSource()).isSelected())
            text.setFont(new Font("Arial", Font.PLAIN, 13));
                }

        else if (e.getSource() == italic){
            if(((JCheckBoxMenuItem) e.getSource()).isSelected()){
                bold.setSelected(false);
            text.setFont(new Font("Arial", Font.ITALIC, 13));
            }
            
            else if(!((JCheckBoxMenuItem) e.getSource()).isSelected())
            text.setFont(new Font("Arial", Font.PLAIN, 13));
                }
            
        else if(e.getSource() == combo){
            String font = (String) combo.getSelectedItem();
            int size = Integer.parseInt((String)fontSize.getSelectedItem());
            text.setFont(new Font(font, Font.PLAIN, size));
        }
        
        else if(e.getSource() == fontSize){
            int size = Integer.parseInt((String)fontSize.getSelectedItem());
            String name = (String) combo.getSelectedItem();

            text.setFont(new Font(name, Font.PLAIN, size));
            
        }
                
    }


}
