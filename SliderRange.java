import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


public class SliderRange extends JFrame implements ChangeListener{

    JSlider slide;
    JLabel label;


    public SliderRange(){
        setSize(new Dimension(400,500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        slide = new JSlider();
        slide.setMinimum(0);
        slide.setMaximum(100);

        slide.setMajorTickSpacing(10);
        slide.setMinorTickSpacing(2);

        slide.setPaintLabels(true);
        slide.setPaintTicks(true);
        slide.setPaintTrack(true);
        slide.addChangeListener(this);

        label = new JLabel("The value of slider is : " + slide.getValue());
        add(slide);
        add(label);

        setVisible(true);

    }
    public static void main(String[] args) {
        new SliderRange();
    }

    public void stateChanged(ChangeEvent e){
        label.setText("The value of slider is : "+ slide.getValue() );
    }
}
