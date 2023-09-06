public class Bank{

    private int kundenanzahl; 
    private int kontenanzahl; 
    private int geld;
    private Kunde[] kunden;  
    
    public Bank(int kontenanzahl, int geld){
      this.kontenanzahl = kontenanzahl; 
      this.geld = geld;
      kunden = new Kunde[1000];
      kundenanzahl = 0; 
    }

    public int getKundeanzahl(){return kundenanzahl;}
    public int getKontenanzahl(){return kontenanzahl;}
    public int getGeld(){return geld;}
    public void setKundeanzahl(int kundenanzahl){this.kundenanzahl = kundenanzahl;}
    public void setKontenanzahl(int kontenanzahl){this.kontenanzahl = kontenanzahl;}
    public void setGeld(int geld){this.geld = geld;}

    public void neuerKunde(String name, String vorname, int gebDat, String adresse){
      int kundennr = kundenanzahl+1001; 
      kunden[kundenanzahl] = new Kunde(name, vorname, kundennr , adresse, gebDat);
      kundenanzahl++; 
    }
    
  }