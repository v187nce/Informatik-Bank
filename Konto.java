public class Konto{

    private int kontonr; 
    private int saldo; 
    private Kunde inhaber;
    
    public Konto(int kontonr, int saldo, Kunde inhaber){
      this.kontonr = kontonr; 
      this.saldo = saldo; 
      this.inhaber = inhaber;
    }
  
    public int getKontonr(){return kontonr;}
    public void setKontonr(int kontonr){this.kontonr = kontonr;}
    public int getSaldo(){return saldo;}
    public void setSaldo(int saldo){this.saldo = saldo;}
    public Kunde getInhaber(){return inhaber;}
    public void setInhaber(Kunde inhaber){this.inhaber = inhaber;}
    

    
}