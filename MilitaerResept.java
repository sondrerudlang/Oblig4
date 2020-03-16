//Klasse for resepter til de i militæret. Gir 100 % rabatt på legemdidler.

class MilitaerResept extends HvitResept{

  //Konstruktør. Har ingen andre argumenter enn HvitResept.
  public MilitaerResept (Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reiterasjon){
    super (legemiddel, utskrivendeLege, pasient, reiterasjon);
  }

  public double prisAaBetale (){
    return 0;
  }
}
