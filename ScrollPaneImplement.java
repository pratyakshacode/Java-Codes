import java.awt.*;

public class ScrollPaneImplement extends Frame{
    
    public ScrollPaneImplement(){
        setSize(new Dimension(400,400));
        setVisible(true);

        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
        TextArea t = new TextArea();

        sp.setSize(new Dimension(200,200));
        sp.add(t);

        add(sp);
    }
    public static void main(String[] args) {
        new ScrollPaneImplement();
       

    }
}
