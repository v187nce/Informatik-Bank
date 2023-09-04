public class Konto{

    private int kontonr; 
    private int saldo; 
    
    public Konto(int kontonr, int saldo){
      this.kontonr = kontonr; 
      this.saldo = saldo; 
    }
  
    public int getKontonr(){return kontonr;}
    public void setKontonr(int kontonr){this.kontonr = kontonr;}
    public int getSaldo(){return saldo;}
    public void setSaldo(int saldo){this.saldo = saldo;}
    
  }