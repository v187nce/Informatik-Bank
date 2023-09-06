import java.util.Scanner;

public class Kunde{

    private String name; 
    private String vorname; 
    private int gebDat;
    private int kundennr;  
    private String adresse;
    private Konto konto1 = new Konto(12345, 120, null);
    private Konto konto2 = new Konto(23456, 120, null);

  
    public Kunde(String name, String vorname, int kundennr, String adresse, int gebDat){
      this.name = name; 
      this.vorname = vorname; 
      this.kundennr = kundennr;  
      this.adresse = adresse;
      this.gebDat = gebDat;
      
    }
    public String getName(){return name;}
    public String getVorname(){return vorname;}
    public String getAdresse(){return adresse;}
    public int getGebDat(){return gebDat;}
    public int getKundennr(){return kundennr;}
    public void setName(String name){this.name = name;}
    public void setAdresse(String adresse){this.adresse = adresse;}
    public void setVorname(String vorname){this.vorname = vorname;}
    public void setKundennr(int kundennr){this.kundennr = kundennr;}
    public void setGebDat(int gebDat){this.gebDat = gebDat;}

    public void auszahlen(int betrag, int kontonr){
        if (kontonr == konto1.getKontonr()){
            if (konto1.getSaldo() >= betrag){
                konto1.setSaldo(konto1.getSaldo() - betrag);
                System.out.println("Sie haben nun " + betrag + " Euro auszahlen lassen." + "\n" + "Ihr neuer Kontostand beträgt nun: " + konto1.getSaldo());
            }
            
        } else if (kontonr == konto2.getKontonr()){
            if (konto2.getSaldo() >= betrag){
                konto2.setSaldo(konto2.getSaldo() - betrag);
                System.out.println("Sie haben nun " + betrag + " Euro auszahlen lassen." + "\n" + "Ihr neuer Kontostand beträgt nun: " + konto2.getSaldo());
            }
        }
        
    }

    public void einzahlen(){

    }

    public void abheben(){

    }

    public void ueberweisen(){

    }


    
  }