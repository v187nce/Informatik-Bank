public class Girokonto extends Konto{

    private int dispo; 
  
    public Girokonto(int kontonr, int saldo, int dispo){
      super(kontonr, saldo);
      this.dispo = dispo; 
    }
  
    public int getDispo(){return dispo;}
    public void setDispo(int dispo){this.dispo = dispo;}
  }        