import java.awt.*;
import java.awt.event.*;
public class MouseAdapterClass extends MouseAdapter
    {
        Frame F;
        MouseAdapterClass()
        {
            F=new Frame("MouseAdapter");  //Title of Frame   
            F.addMouseListener(this);
            F.addMouseMotionListener(this);
            F.addWindowListener (new WindowAdapter()   //Method for Window or Frame Closing
            {
                public void windowClosing (WindowEvent e)
                {
                    F.dispose(); 
                }
            });
            F.setSize(400,400);
            F.setLayout(null);
            F.setVisible(true);
        }
        public void mouseClicked(MouseEvent e)  //Method for Mouse Clicking Event
        {
            Graphics g = F.getGraphics();
            g.setColor(Color.GREEN);
            g.fillOval(e.getX(), e.getY(), 20, 20);
        }
        public void mouseDragged(MouseEvent e)   //Method for Mouse Dragging Event
            {
                Graphics g = F.getGraphics();
                g.setColor(Color.BLUE);
                g.fillOval(e.getX(), e.getY(), 10, 10);
            }
        public static void main(String[] args)
        {
            new MouseAdapterClass();
        }
    }