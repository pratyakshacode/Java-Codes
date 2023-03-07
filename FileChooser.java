import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class FileChooser extends JFrame {

    JFileChooser choose;
    JButton btn;
    JButton save;
    File file;
    JTextArea area;
    public FileChooser(){
        setSize(new Dimension(500,600));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        choose = new JFileChooser();
        btn = new JButton("Open");
        save = new JButton("Save");
        area = new JTextArea();

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int val = choose.showOpenDialog(null);
                if(val == JFileChooser.APPROVE_OPTION){

                    file = choose.getSelectedFile();

                    try{
                    BufferedReader read = new BufferedReader(new FileReader(file));
                    String line = read.readLine();

                    while(line != null){
                        area.append(line);
                        line = read.readLine();
                    }

                    read.close();

                    } catch(Exception ex){
                        ex.printStackTrace();
                    }
                    
                    
                }
            }
        });

        save.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                int opt = choose.showSaveDialog(null);

                if(opt == JFileChooser.APPROVE_OPTION){

                    try{
                    FileWriter write = new FileWriter(choose.getSelectedFile().getName());
                    write.append(area.getText());
                
                    write.close();

                    } catch(Exception ex){
                        ex.printStackTrace();
                    }
                }

            }
        });

        add(btn, BorderLayout.NORTH);
        add(save, BorderLayout.SOUTH);
        add(area, BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String [] args){
        new FileChooser();
    }
}