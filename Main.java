class Main {
    public static void main(String[] args) {
      Konto konto1 = new Girokonto(10201, 5550, 10000); 
      System.out.println("Die Kontonummer von ihrem Konto entspricht: " + konto1.getKontonr());
    }
  }