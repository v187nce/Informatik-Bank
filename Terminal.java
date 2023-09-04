public class Terminal{

    private int geldvorrat; 
    private int automatennummer; 
    
    public Terminal(int geldvorrat, int automatennummer){
      this.geldvorrat = geldvorrat; 
      this.automatennummer = automatennummer; 
    }

    public int getGeldvorrat(){return geldvorrat;}
    public int getAutomatennummer(){return automatennummer;}
    public void setGeldvorrat(int geldvorrat){this.geldvorrat = geldvorrat;}
    public void setAutomatennummer(int automatennummer){this.automatennummer = automatennummer;}
    
  }