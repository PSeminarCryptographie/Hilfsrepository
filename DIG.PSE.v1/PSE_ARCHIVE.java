import java.awt.*;
import javax.swing.*;
import java.awt.event.*;        //Import von vorgefertigen Klassen für die Fensterprogrammierung

public class PSE_ARCHIVE extends JFrame implements ActionListener 
{
    PSE PeriodicTable = new PSE();
    
    JTextField t1 = new JTextField();       //JTextField sind Eingabefelder
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextField t5 = new JTextField();
    JTextField t6 = new JTextField();
    JTextField t7 = new JTextField();
    JTextField t8 = new JTextField();
    JTextField t9 = new JTextField();
    JTextField t10 = new JTextField();
    JTextField t11 = new JTextField();
    
    JLabel l1 = new JLabel("Digitales Periodensystem");         //JLabels sind Schriftzüge
    JLabel l2 = new JLabel("Ordnungszahl");
    JLabel l3 = new JLabel("Massenzahl");
    JLabel l4 = new JLabel("Elementsymbol");
    JLabel l5 = new JLabel("Elementname");
    JLabel l6 = new JLabel("exakte Masse in u");
    JLabel l7 = new JLabel("Gruppennummer");
    JLabel l8 = new JLabel("Periode");
    JLabel l9 = new JLabel("EN");
    JLabel l10 = new JLabel("Siedetemperatur in °C");
    JLabel l11 = new JLabel("Elektronenkonfiguration");
    JLabel l12 = new JLabel("häufigste Oxidationszahl");
    
    JPanel p1 = new JPanel();           //JPanels sind Gruppierungen von JLabels, JButtons, JTextFields etc.
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    
    JButton Knopf = new JButton("Anzeigen");            //Knöpfe für Interaktion mit Mauszeiger
    JButton Knopf2 = new JButton("Verlassen");
    
    public PSE_ARCHIVE()
    {
        
        this.setTitle("Periodensystem");        //Benennung des Fensters in der Kopfleiste
        this.setBounds(100, 100, 1100, 230);    //Größe des Fensters
        this.setLayout(new FlowLayout());
        
        
        p1.add(l2); p1.add(t1);
        p2.add(l3); p2.add(t2); p2.add(l4); p2.add(t3); p2.add(l5); p2.add(t4); p2.add(l6); p2.add(t5);
        p3.add(l7); p3.add(t6); p3.add(l8); p3.add(t7);
        p4.add(l9); p4.add(t8); p4.add(l10); p4.add(t9); p4.add(l11); p4.add(t10); p4.add(l12); p4.add(t11);
        
        this.add(l1); this.add(p1); this.add(p2); this.add(p3); this.add(p4); this.add(Knopf); this.add(Knopf2);
        
        Knopf.addActionListener(this);      //ActionListener notwendig, um Knöpfen eine Aktion zuzuweisen
        Knopf2.addActionListener(this);
        
        l1.setHorizontalAlignment(JLabel.CENTER);       //Zentrierung von Text
        l2.setHorizontalAlignment(JLabel.CENTER);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l4.setHorizontalAlignment(JLabel.CENTER);
        l5.setHorizontalAlignment(JLabel.CENTER);
        l6.setHorizontalAlignment(JLabel.CENTER);
        l7.setHorizontalAlignment(JLabel.CENTER);
        l8.setHorizontalAlignment(JLabel.CENTER);
        l9.setHorizontalAlignment(JLabel.CENTER);
        l10.setHorizontalAlignment(JLabel.CENTER);
        l11.setHorizontalAlignment(JLabel.CENTER);
        l12.setHorizontalAlignment(JLabel.CENTER);
        
        l1.setFont(new Font("Constantia", Font.BOLD, 24));      //Schriftgröße, Art, Font
        l2.setFont(new Font("Constantia", Font.PLAIN, 15));
        l3.setFont(new Font("Constantia", Font.PLAIN, 15));
        l4.setFont(new Font("Constantia", Font.PLAIN, 15));
        l5.setFont(new Font("Constantia", Font.PLAIN, 15));
        l6.setFont(new Font("Constantia", Font.PLAIN, 15));
        l7.setFont(new Font("Constantia", Font.PLAIN, 15));
        l8.setFont(new Font("Constantia", Font.PLAIN, 15));
        l9.setFont(new Font("Constantia", Font.PLAIN, 15));
        l10.setFont(new Font("Constantia", Font.PLAIN, 15));
        l11.setFont(new Font("Constantia", Font.PLAIN, 15));
        l12.setFont(new Font("Constantia", Font.PLAIN, 15));
        
        t1.setFont(new Font("Constantia", Font.PLAIN, 15));
        t2.setFont(new Font("Constantia", Font.PLAIN, 15));
        t3.setFont(new Font("Constantia", Font.PLAIN, 15));
        t4.setFont(new Font("Constantia", Font.PLAIN, 15));
        t5.setFont(new Font("Constantia", Font.PLAIN, 15));
        t6.setFont(new Font("Constantia", Font.PLAIN, 15));
        t7.setFont(new Font("Constantia", Font.PLAIN, 15));
        t8.setFont(new Font("Constantia", Font.PLAIN, 15));
        t9.setFont(new Font("Constantia", Font.PLAIN, 15));
        t10.setFont(new Font("Constantia", Font.PLAIN, 15));
        t11.setFont(new Font("Constantia", Font.PLAIN, 15));
        
        t1.setColumns(8);       //Größe für Textfelder
        t2.setColumns(8);
        t3.setColumns(8);
        t4.setColumns(10);
        t5.setColumns(8);
        t6.setColumns(8);
        t7.setColumns(8);
        t8.setColumns(8);
        t9.setColumns(8);
        t10.setColumns(12);
        t11.setColumns(8);
        
        t2.setEnabled(false);       //Beschreibbarkeit eines Feldes; False -> kein Eigentext einsetzbar
        t3.setEnabled(false);
        t4.setEnabled(false);
        t5.setEnabled(false);
        t6.setEnabled(false);
        t7.setEnabled(false);
        t8.setEnabled(false);
        t9.setEnabled(false);
        t10.setEnabled(false);
        t11.setEnabled(false);
        
        this.setVisible(true);      //Sichtbarkeit des Fensters
        this.toFront();
    }
    
    public void actionPerformed(ActionEvent ev)         //ActionListener für die Knöpfe dieses Fensters -> Initialisierung der Eingabe -> Ausgabe passender Werte
    {
        int a = -1;
        String MZ = "";
        String ES = "";
        String ENA = "";
        String EM = "";
        String GN = "";
        String PN = "";
        String EN = "";
        String SDT = "";
        String EK = "";
        String OX = "";
        
        
        
        try{
            if(ev.getSource() == Knopf)
            {
            a = Integer.valueOf(t1.getText())-1;
            MZ = Integer.toString(PeriodicTable.Periodensystem [a].Massenzahl);
            ES = PeriodicTable.Periodensystem [a].Elementsymbol;
            ENA = PeriodicTable.Periodensystem [a].Elementname;
            EM = Double.toString(PeriodicTable.Periodensystem [a].exakteMasse);
            GN = PeriodicTable.Periodensystem [a].Gruppennummer;
            PN = Integer.toString(PeriodicTable.Periodensystem [a].Periode);
            EN = Double.toString(PeriodicTable.Periodensystem [a].Elektronegativität);
            SDT = PeriodicTable.Periodensystem [a].Siedetemperatur;
            EK = PeriodicTable.Periodensystem [a].Elektronenkonfiguration;
            OX = Integer.toString(PeriodicTable.Periodensystem [a].häufigsteOxidationszahl);}
            
            else if(ev.getSource() == Knopf2)
            
            
            {System.exit(0);}       //Einstellen jeglicher Programmtätigkeit
        }
            
            //bei Fehler(bsp. keine gültige Eingabe) catch-Klausel für Alternativen
        
        catch(Exception ex) {MZ = "Error"; ES = "Error"; ENA = "Error"; EM = "Error"; GN = "Error"; PN = "Error"; EN = "Error"; SDT = "Error"; EK = "Error"; OX = "Error";}
            
            
            t2.setText(MZ);     //Einsetzen der passenden Werte zur Eingabe in die nicht beschreibbaren Textfelder
            t3.setText(ES);
            t4.setText(ENA);
            t5.setText(EM);
            t6.setText(GN);
            t7.setText(PN);
            t8.setText(EN);
            t9.setText(SDT);
            t10.setText(EK);
            t11.setText(OX);
        }
        }
        
            
       

