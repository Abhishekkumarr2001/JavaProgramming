import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
public class LayoutManager extends JFrame implements ActionListener 
{
    JButton Button1, Button2, Button3;
    CardLayout CL;
    Container C;
    LayoutManager()
    {
        Frame F = new Frame();
        F.setSize(400,400);
        GridLayout Object = new GridLayout(3,3);
        F.setLayout(Object);
        Panel P = new Panel();
        Label L1 = new Label("Name");
        TextField TF1 = new TextField(30);
        P.add(L1);
        P.add(TF1);
        F.add(P);
        Label L2 = new Label("ID Number");
        TextField TF2 = new TextField(30);
        Button1 = new JButton("Check");
        P.add(L2);P.add(TF2);
        P.add(Button1);
        Button2 = new JButton("Assignment Submitted");
        C = this.getContentPane();
        CL = new CardLayout(10, 20);
        C.setLayout(CL);
        C.add("Card1", P);
        C.add("Card2", Button2);

        Button1.addActionListener(this);
        Button2.addActionListener(this);
        setVisible(true);
        setSize(400, 200);
        setTitle("Assignment Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        CL.next(C);
    }
    public static void main(String[] args) 
    {
        new LayoutManager();
    }
}