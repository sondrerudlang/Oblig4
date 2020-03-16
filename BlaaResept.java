//Klassen har ingen egne metoder, men prisen er 25 % av originalpris.

class BlaaResept extends Resept{

  public BlaaResept (Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reiterasjon){
    super (legemiddel, utskrivendeLege, pasient, reiterasjon);
  }

  //Returnerer prisen.
  public double prisAaBetale (){

    //Setter prisen til 1/4 av originalpris.
    return legMid.hentPris()*0.25;
  }

  //Returnerer fargen på resepten.
  public String farge (){
    return "blaa";
  }
}
