//Klassen arver metoder fra Legemiddel. Oppbevarer i tillegg en int for å
//vise hvor vanedannende det er.

class Vanedannende extends Legemiddel{

  private int styrke;

  //Konstruktøren tar inn navn, pris og virkestoff, og lagrer disse. Den gir også
  //en unik id, og teller en opp.
  public Vanedannende (String n, double p, double v, int s){
    super (n, p, v);
    styrke = s;
  }

  //Returnerer en int som sier hvor vanedannende stoffet er.
  public int hentVanedannendeStyrke (){
    return styrke;
  }
}
