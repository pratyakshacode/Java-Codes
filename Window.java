import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Window extends JFrame{
    JWindow window;
    JProgressBar progress;
    Timer time;
    JLabel label;
    JPanel panel;

    public Window(){
        setSize(new Dimension(500,600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        window = new JWindow();
        window.setSize(new Dimension(250,250));
        
        progress = new JProgressBar(0,100);

        window.add(progress, BorderLayout.PAGE_END);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        ImageIcon icon = new ImageIcon("logo.jpg");     
        label = new JLabel(icon);
        add(label, BorderLayout.CENTER);
        label.setBounds(50,50,100,100);

        panel = new JPanel();
        panel.setLayout(null);
        
        panel.setBorder(BorderFactory.createTitledBorder("Making"));
        window.add(panel);
        panel.add(label);
        progress.setForeground(Color.orange);


        time = new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int p = progress.getValue();

                if(p == 100){
                    time.stop();
                    window.dispose();
                    setVisible(true);
                }
                else {
                    progress.setValue(p += 10);
                }
            }
        });
        
        revalidate();
        time.start();
    }
    public static void main(String[] args) {
        new Window();
    }
}
