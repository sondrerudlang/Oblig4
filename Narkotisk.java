//Klassen arver metoder fra Legemiddel. Oppbevarer i tillegg en int for å
//vise hvor sterkt narkotisk det er.

class Narkotisk extends Legemiddel{

  private int styrke;

  //Konstruktøren tar inn navn, pris og virkestoff, og lagrer disse. Den gir også
  //en unik id, og teller en opp.
  public Narkotisk (String n, double p, double v, int s){
    super (n, p, v);
    styrke = s;
  }

  //Returnerer styrken til stoffet.
  public int hentNarkotiskStyrke (){
    return styrke;
  }
}
