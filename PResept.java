//Resept som gir rabatt på prevensjonsmidler. Rabatten er på 108 kroner, men
//kan ikke kjøre prisen under 0. Reit settes også alltid til 3.

class PResept extends HvitResept{

  public PResept (Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient){
    super (legemiddel, utskrivendeLege, pasient, 3);
  }

  public double prisAaBetale (){
    //if-test for å sette pris. Dersom den er mindre enn 108 settes prisen til 0.
    if (legMid.hentPris() > 108){
      return legMid.hentPris() - 108;
    }
    else{
      return 0;
    }
  }
}
