public class Sparkonto extends Konto{

    private int zinssatz;
    
    public Sparkonto(int kontonr, int saldo, int zinssatz){
      super(kontonr, saldo);
      this.zinssatz = zinssatz; 
    }
  
    public int getZinssatz(){return zinssatz;}
    public void setZinssatz(int zinssatz){this.zinssatz = zinssatz;}
  }