//Klasse for å holde oversikt over resepter.
abstract class Resept {

  protected Legemiddel legMid;
  private Lege lege;
  private int pasId, reit, id;
  private static int tellerId = 0;

  //Konstruktør som tar inne Legemiddel, Lege, pasientId og reit.
  public Resept (Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reiterasjon){
    legMid = legemiddel;
    lege = utskrivendeLege;
    pas = pasient;
    pas = pasient.ID;
    reit = reiterasjon;
    id = tellerId;
    tellerId++;
  }

  //Returnerer reseptens ID.
  public int hentId (){
    return id;
  }

  //Returnerer hvilket legemiddel resepten gjelder.
  public Legemiddel hentLegemiddel (){
    return legMid;
  }

  //Returnerer hvilken lege som har skrevet ut resepten.
  public Lege hentLege (){
    return lege;
  }

  //Returnerer pasientens ID.
  public int hentPasientId (){
    return pasId;
  }

  //Returnerer antalle ganger resepten har igjen.
  public int hentReit (){
    return reit;
  }

  //Ser om resepten er tom eller ikke. Returnerer true om den fortsatt kan brukes.
  public boolean bruk (){

    //Sjekker om reit er tom eller ikke.
    if (reit > 0){
      reit =-1;
      return true;
    }
    return false;
  }

  public String toString(){
    return "Resepten gjelder for " + legMid.hentNavn() + ", er utskrevet av " + lege.hentNavn() +
    ", er en " + farge() + " resept, har " + reit + " reit igjen, gjelder for " +
    "pasient " + pasId + ", har reseptnummer " + id + ", og prisen er " + prisAaBetale() +
    ".";
  }

  //Returnerer om det er blå eller hvit resept.
  abstract String farge();

  //Returnerer prisen for legemiddelet, med ev. rabatt fra resept.
  abstract double prisAaBetale();
}
