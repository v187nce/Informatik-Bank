public class Kunde{

    private String name; 
    private String vorname; 
    private int kundennr; 
    private String anschrift; 
    private int PIN; 
  
    public Kunde(String name, String vorname, String anschrift, int kundennr, int PIN){
      this.name = name; 
      this.vorname = vorname; 
      this.kundennr = kundennr; 
      this.anschrift = anschrift; 
      this.PIN = PIN; 
      
    }
    public String getName(){return name;}
    public String getVorname(){return vorname;}
    public String getAnschrift(){return anschrift;}
    public int getKundennr(){return kundennr;}
    public int getPIN(){return PIN;}
    public void setName(String name){this.name = name;}
    public void setVorname(String vorname){this.vorname = vorname;}
    public void setAnschrift(String anschrift){this.anschrift = anschrift;}
    public void setKundennr(int kundennr){this.kundennr = kundennr;}
    public void setPIN(int PIN){this.PIN = PIN;} 
    
  }