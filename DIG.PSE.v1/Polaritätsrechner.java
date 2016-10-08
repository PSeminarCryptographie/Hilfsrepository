import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Polaritätsrechner extends JFrame implements ActionListener
{
    JTextField F1 = new JTextField();
    JTextField F2 = new JTextField();
    JTextField F3 = new JTextField();
    JTextField F4 = new JTextField();
    
    JPanel l = new JPanel();
    JPanel e = new JPanel();
    
    JButton V1 = new JButton("ausführen");
    
    JLabel Z1 = new JLabel("Vergleich von");
    JLabel Z2 = new JLabel("mit");
    
    PSE P1 = new PSE();
    
    public Polaritätsrechner()
    {
        this.setTitle("Elektronegativitätsrechner");
        this.setBounds(100, 100, 400, 120);
        this.setLayout(new FlowLayout());
        
        l.add(Z1); l.add(F1); l.add(Z2); l.add(F2);
        e.add(F3); e.add(F4);
        
        this.add(l); this.add(e); this.add(V1);
        
        V1.addActionListener(this);
        
        Z1.setHorizontalAlignment(JLabel.CENTER);
        Z2.setHorizontalAlignment(JLabel.CENTER);
        
        Z1.setFont(new Font("Constantia", Font.PLAIN, 15));
        Z2.setFont(new Font("Constantia", Font.PLAIN, 15));
        
        F1.setFont(new Font("Constantia", Font.PLAIN, 15));
        F2.setFont(new Font("Constantia", Font.PLAIN, 15));
        F3.setFont(new Font("Constantia", Font.PLAIN, 15));
        F4.setFont(new Font("Constantia", Font.PLAIN, 15));
        
        F1.setColumns(3);
        F2.setColumns(3);
        F3.setColumns(10);
        F4.setColumns(8);
        
        F3.setEnabled(false);
        F4.setEnabled(false);
        
        this.setVisible(true);
        this.toFront();
    }
    
    public void actionPerformed(ActionEvent ev)
    {
        int n = Integer.valueOf(F1.getText())-1;
        int m = Integer.valueOf(F2.getText())-1;
        
        double d = 0;
        String p = "";
        double N = 0;
        double M = 0;
        
        try
        {
            if(P1.Periodensystem [n].Elektronegativität > 0 &&  P1.Periodensystem [m].Elektronegativität > 0)
            {
            N = P1.Periodensystem [n].Elektronegativität;
            M = P1.Periodensystem [m].Elektronegativität;
            
            d = N - M;
            
            if(d < 0)
            {
                d = -d;
            }
            
            if(d < 0.4)
            {
                p = "unpolar";
            }
            else if(d < 1.7)
            {
                p = "polar";
            }
            else if(d >= 1.7)
            {
                p = "ionisch";
            }
            
            d = Math.round(1000.0 * d) / 1000.0;
        }
        else
        {
            p = "Error";
            d = -1;
        }
        }
            catch(Exception ex)
            {
                  d = -1; p = "Error";
            }
            
            F3.setText(Double.toString(d));
            F4.setText(p);
        }
    }
                    
                
            
            
            
        
    
    