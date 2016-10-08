import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CONTROL_PANEL extends JFrame implements ActionListener
{
    JLabel Head = new JLabel("DigiChem");
    
    JButton Zeiger1 = new JButton("PSE_Archiv");
    JButton Zeiger2 = new JButton("Polarität");
    JButton Leaver = new JButton("Beenden");
    
    PSE_ARCHIVE Archiv;
    Polaritätsrechner PR;
    
    public CONTROL_PANEL()
    {
        this.setTitle("DigiChem");
        this.setBounds(100,100,350,150);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        //angemessenes Beenden des Programms mithilfe des "X" in der Kopfleiste
        this.add(Head); this.add(Zeiger1); this.add(Zeiger2); this.add(Leaver);
        
        Zeiger1.addActionListener(this);
        Zeiger2.addActionListener(this);
        Leaver.addActionListener(this);
        
        Head.setHorizontalAlignment(JLabel.CENTER);
        
        Head.setFont(new Font("Castellar", Font.BOLD, 50));
        
        this.setVisible(true);
        this.toFront();
    }
    
    public void actionPerformed(ActionEvent ev)
    {
        try
        {
            if(ev.getSource() == Zeiger1)
            {
                Archiv = new PSE_ARCHIVE();
            }
            else 
            if(ev.getSource() == Leaver)
            {
                System.exit(0);
            }
            else
            if(ev.getSource() == Zeiger2)
            {
                PR = new Polaritätsrechner();
            }
        }
        catch (Exception ex){System.exit(0);}
    }
}
    