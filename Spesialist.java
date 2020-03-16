//Spesialister er leger som kan skrive ut narkotiske stoffer.

class Spesialist extends Lege implements Godkjenningsfritak{

  private int kontrollID;

  //Konstruktøren tar inn navn (n).
  public Spesialist (String n, int konID){
    super (n);
    kontrollID = konID;
  }


  //Interface hentet fra Godkjenningsfritak. Brukes for å sjekke kontrollIDen.
  public int hentKontrollID(){
    return kontrollID;
  }

  public String toString(){
    return "Legen er en spesialist, som heter " + navn + "og har kontroll-ID " +
    kontrollID + ".";
  }
}
