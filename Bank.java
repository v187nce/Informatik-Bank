import java.util.ArrayList; 
import java.util.List; 
import java.util.*; 

public class Bank{

    private int kundenanzahl; 
    private int kontenanzahl; 
    private int geld;
    private Kunde[] kunden;  
    private Konto[] konten; 
    
    public Bank(int kontenanzahl, int geld){
      this.kontenanzahl = kontenanzahl; 
      this.geld = geld;
      kunden = new Kunde[1000];
      kundenanzahl = 0; 
      konten = new Konto[1000];
      kontenanzahl = 0;  
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

    public void neuesKonto(int saldo, Kunde inhaber, char art, int dispo, int zinssatz){
      int kontonr = kontenanzahl+2001; 
      List<Kunde> kundenList = new ArrayList<>();
      for (int i = 0; i< kunden.length; i++){
        kundenList.add(kunden[i]);
      }
      if (kundenList.contains(inhaber)){
        if (art == 'G'){
          konten[kontenanzahl] = new Girokonto(kontonr, saldo, dispo, inhaber);
          kontenanzahl++; 
        } else if (art == 'S'){
          konten[kontenanzahl] = new Sparkonto(kontonr, saldo, zinssatz, inhaber);
          kontenanzahl++;
        }
      }else {
        System.out.println("Dieser Kunde existiert nicht und sie können somit kein Koto in seinem Namen anlegen!");
      }
    }    
  }