import java.awt.*;    
import java.awt.event.*;    
public class KeyAdapterClass extends KeyAdapter
        {      
        Label L;
        TextArea A;    
        Frame F;  
        KeyAdapterClass() 
        {     
                F = new Frame ("KeyAdapterClass"); //Title of Frame   
                L = new Label();
                L.setBounds (20, 50, 200, 20);
                A = new TextArea();
                A.setBounds (20, 100, 350, 200);
                A.addKeyListener(this); 
                F.add(L);
                F.add(A); 
                F.setSize (400, 400);    
                F.setLayout (null);    
                F.setVisible (true); 
                F.addWindowListener (new WindowAdapter()   //Method for Window or Frame Closing
            {
                public void windowClosing (WindowEvent e)
                {
                    F.dispose(); 
                }
            });   
        }   
        public void keyReleased (KeyEvent e) //Method For KeyAdapter 
        {
                String text = A.getText();
                String words[] = text.split ("\\s");
                L.setText(" Words Count: " + words.length + "  Characters: " + text.length());
        }
        public static void main(String[] args)
                {    
                new KeyAdapterClass();    
                }    
        }    
