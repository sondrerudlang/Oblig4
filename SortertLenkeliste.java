//Klassen extender Lenkeliste, men er sortert. Den sorteres ved å
//implementere interfacen comparable.
class SortertLenkeliste<T extends Comparable <T>> extends Lenkeliste<T>{

  //Metoden setter inn objekter i sortert rekkefølge fra størst til minst.
  public void leggTil(T x){

    //Sjekker om det er et objekt i lenken fra før, og legger til et objekt via supermetode.
    if (start == null){
      super.leggTil (x);
      return;
    }

    //Går gjennom listen og sjekker for første utgave som er større enn x.
    for (int i = 0; i < stoerrelse(); i++){
      if (hent(i).compareTo(x) > 0){
        //Legger til ny node på gitt posisjon, via superMetode.
        super.leggTil(i, x);
        return;
      }
    }
    //Legger til node dersom det ikke er noe større i lenken.
    super.leggTil(x);
    return;
  }

  //Metoden fjerner automatisk det største objektet, mao. det til sist.
  public T fjern(){
    return fjern (stoerrelse()-1);
  }

  //Begrenser mulighetene for å legge til objekter i usortert rekkefølge ved å
  //kaste UnsupportedOperationException hvis de prøver sett(pos, x) eller
  //leggTil (pos, x).
  public void leggTil (int pos, T x) throws UnsupportedOperationException{
    throw new UnsupportedOperationException();
  }

  public void sett (int pos, T x) throws UnsupportedOperationException{
    throw new UnsupportedOperationException();
  }
}
