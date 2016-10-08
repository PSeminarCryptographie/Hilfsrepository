public class ELEMENT
{
    int Ordnungszahl;
    int Massenzahl;
    String Elementname;
    double exakteMasse;
    double Elektronegativität;
    String Siedetemperatur;
    String Elektronenkonfiguration;
    String Elementsymbol;
    int Periode;
    String Gruppennummer;
    int häufigsteOxidationszahl;
    
    public ELEMENT(int OZ, int MZ, String ENa, double XM, double EN, String SDT, String EK, String ES, int P, String GN, int OX)
    {
        Ordnungszahl = OZ;
        Massenzahl = MZ;
        Elementname = ENa;
        exakteMasse = XM;
        Elektronegativität = EN;
        Siedetemperatur = SDT;
        Elektronenkonfiguration = EK;
        Elementsymbol = ES;
        Periode = P;
        Gruppennummer = GN;
        häufigsteOxidationszahl = OX;
    }
}
        
