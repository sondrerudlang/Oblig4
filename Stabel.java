//Klassen utvider Lenkeliste.java, men implementerer LIFO.
class Stabel<T> extends Lenkeliste<T>{

  //Legger til en node på slutten av listen.
  public void leggPaa (T x){
    leggTil(x);
  }

  //fjerner den siste noden på listen og returnerer objektet der.
  public T taAv (){
    return fjern(stoerrelse()-1);
  }
}
