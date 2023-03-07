import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.awt.*;

public class Table extends JFrame{

    static JTable table;
    static JPanel panel;
    static JPanel tablePanel;
    static JPanel btnpanel;

    public Table(){
        setSize(new Dimension(500,600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2,1));
        setVisible(true);
        
    }
    public static void main(String[] args) {
        Table t = new Table();
        
        
        Object [][] data = {
            {101,"Ram", 21},
            {102, "Dev", 19},
            {103, "Kartik", 20}
        };
        String columnName [] = {"Roll no", "Name", "Age"};

        DefaultTableModel model = new DefaultTableModel(data, columnName);
        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        panel = new JPanel();
        tablePanel = new JPanel();
        btnpanel = new JPanel();

        panel.setBackground(Color.darkGray);
        tablePanel.setBackground(Color.lightGray);
        btnpanel.setBackground(Color.lightGray);

        tablePanel.add(table);
        tablePanel.setLayout(new GridLayout(1,1));
        t.add(tablePanel);
        // t.add(panel);
        t.add(btnpanel);

        JButton btn1 = new JButton("Add");
        JButton btn2 = new JButton("Update");
        JButton btn3 = new JButton("Delete");

        JTextField f1 = new JTextField();
        JTextField f2 = new JTextField();
        JTextField f3 = new JTextField();

        btnpanel.setLayout(null);

        f1.setBounds(10,10,150,30);
        f2.setBounds(10, 50, 150,30);
        f3.setBounds(10, 90, 150, 30);

        btn1.setBounds(180, 10, 80, 30);
        btn2.setBounds(180, 50, 80, 30);
        btn3.setBounds(180, 90, 80, 30);
        btn1.setFocusPainted(false);
        btn2.setFocusPainted(false);
        btn3.setFocusPainted(false);


        btnpanel.add(f1);
        btnpanel.add(f2);
        btnpanel.add(f3);

        btnpanel.add(btn1);
        btnpanel.add(btn2);
        btnpanel.add(btn3);

        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

               try{
                int roll = Integer.parseInt(f1.getText());
                String name = f2.getText();
                int age = Integer.parseInt(f3.getText());

                Object [] arr = {roll, name, age};
                model.addRow(arr);
                f1.setText(null);
                f2.setText(null);
                f3.setText(null);
               } catch (Exception err){

                JOptionPane.showMessageDialog(t, "Empty field", "Error", JOptionPane.ERROR_MESSAGE);
               }
            }
        });

        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                try{
                    int row = table.getSelectedRow();

                    if(row == -1){
                        JOptionPane.showMessageDialog(t, "Please Select the row to update", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }

                    else {
                       
                        model.setValueAt(Integer.parseInt(f1.getText()), row, 0);
                        model.setValueAt(f2.getText(), row, 1);
                        model.setValueAt(Integer.parseInt(f3.getText()), row, 2);

                    }
                } catch(Exception err){
                    JOptionPane.showMessageDialog(t, "Some error Occurred", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        table.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                int row = table.getSelectedRow();

                int roll = (int)model.getValueAt(row, 0);
                String name = (String)model.getValueAt(row, 1);
                int age = (int)model.getValueAt(row, 2);

                f1.setText(String.valueOf(roll));
                f2.setText(name);
                f3.setText(String.valueOf(age));
            }
        });

        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int row = table.getSelectedRow();

                if(row == -1){
                    JOptionPane.showMessageDialog(t, "Please select at least one row", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    model.removeRow(row);
                }
            }
        });
       t.validate();
    }

    
}
