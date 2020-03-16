//Brukes til å opprette hvite resepter. Har ikke noen metoder utover det den
//arver fra Resept.

class HvitResept extends Resept{

  //Konstruktør. Har ingen andre argumenter enn de til Resept.
  public HvitResept (Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reiterasjon){
    super (legemiddel, utskrivendeLege, pasient, reiterasjon);
  }


  //Returnerer fargen på resepten.
  public String farge (){
    return "hvit";
  }

  //Returnerer prisen på legemiddelet.
  public double prisAaBetale (){
    return legMid.hentPris();
  }
}
