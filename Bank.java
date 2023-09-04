public class Bank{

    private int kundenanzahl; 
    private int kontenanzahl; 
    private int geld; 
    
    public Bank(int kundenanzahl, int kontenanzahl, int geld){
      this.kundenanzahl = kundenanzahl; 
      this.kontenanzahl = kontenanzahl; 
      this.geld = geld;
    }

    public int getKundeanzahl(){return kundenanzahl;}
    public int getKontenanzahl(){return kontenanzahl;}
    public int getGeld(){return geld;}
    public void setKundeanzahl(int kundenanzahl){this.kundenanzahl = kundenanzahl;}
    public void setKontenanzahl(int kontenanzahl){this.kontenanzahl = kontenanzahl;}
    public void setGeld(int geld){this.geld = geld;}
    
  }