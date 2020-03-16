//Klassen skal ikke opprette objekter, men de tre klassene Narkotisk, Vandedannende,
//og Vanlig skal arve metoder fra denne klassen.

abstract class Legemiddel {

  //Oppretter private variabler for navn, pris, virkestoff og id. Static int idTeller
  //er til for at alle legemdidler skal ha en unik ID.
  private String navn;
  private double pris, virkestoff;
  private int id;
  private static int idTeller = 0;

  //Konstruktøren tar inn navn, pris og virkestoff, og lagrer disse. Den gir også
  //en unik id, og teller en opp.
  public Legemiddel (String n, double p, double v){
    navn = n;
    pris = p;
    virkestoff = v;
    id = idTeller;
    idTeller++;
  }


  //Returnerer IDen til legemiddelet.
  public int hentId(){
    return id;
  }

  //Returnerer prisen til legemiddelet.
  public double hentPris() {
    return pris;
  }

  //Returnerer navnet til legemiddelet.
  public String hentNavn(){
    return navn;
  }

  //Returnerer antall mg virkestoff.
  public double hentVirkestoff(){
    return virkestoff;
  }

  //Setter en ny pris på legemiddelet.
  public void settNyPris(double nyPris){
    pris = nyPris;
  }

  public String toString (){
    return "Legemiddelet heter " + navn + ", koster " + pris + ", har " +
    virkestoff + " mg virkestoff, og ID " + id + ".";
  }
}
