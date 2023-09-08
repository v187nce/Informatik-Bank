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
      konten = new Konto[2000];
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

    public void neuesKonto(Kunde inhaber, char art, int dispo, int zinssatz){ 
      List<Kunde> kundenList = new ArrayList<>();
      for (int i = 0; i< kunden.length; i++){
        kundenList.add(kunden[i]);
      }
      if (kundenList.contains(inhaber)){
        if (art == 'G'){
          int kontonr = kontenanzahl+200000;
          konten[kontenanzahl] = new Girokonto(kontonr, 0, dispo, inhaber);
          inhaber.setGiro(konten[kontenanzahl]);
          kontenanzahl++; 
        } else if (art == 'S'){
          int kontonr = kontenanzahl+300000;
          konten[kontenanzahl] = new Sparkonto(kontonr, 0, zinssatz, inhaber);
          inhaber.setSpar(konten[kontenanzahl]);
          kontenanzahl++;
        }
      }else {
        System.out.println("Dieser Kunde existiert nicht und sie können somit kein Koto in seinem Namen anlegen!");
      }
    }

    public void einzahlen(int betrag, int kontonr){
      boolean gefunden = false;
      for (int i = 0; i<= konten.length; i++){
        if (konten[i].getKontonr() == kontonr){
            konten[i].setSaldo(konten[i].getSaldo() + betrag);
            System.out.println("Der Betrag von " + betrag + " Euro wurde auf ihr Konto überwiesen!");
            gefunden = true;
        } 
        if (i == konten.length && gefunden == false){
          System.out.println("Unter dieser Kontonummer können wir kein Konto in unserem System finden!");
        }
      } 

    }

  }