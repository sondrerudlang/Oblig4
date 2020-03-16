//Klassen implenterer interfacen Liste, og oppbevarer objekter T i en lenke av
//noder. Den legger standeard til på slutten av lenken, og fjerner og returnerer
//det første elementet som standard

class Lenkeliste<T> implements Liste<T> {

//Den interne klassen Node brukes for å kunne lenke sammen objekter. Den innholder
//data av typen T, og en henvisning til neste Node i lenken.

  class Node {
    Node neste = null;
    T data;
    Node (T x) {
      data = x;
    }
  }

//Deklarerer den private variabelen start av typen Node, som er begynnelsen på lenken.
  protected Node start;

//Setter startnoden til null ved initiering.
  public Lenkeliste (){
    start = null;
  }

//Her kommer alle metodene for å legge til eller endre en node.

//Metoden legger til en node på enden av lenken. plass brukes for å gå gjennom lenken.
  public void leggTil (T x){
    Node plass = start;

    if (start == null){
      start = new Node (x);
    }

    else{
      while (plass.neste != null){
        plass = plass.neste;
      }
      plass.neste = new Node (x);
    }
  }

//Metoden legger til en ny node på posisjonen angitt (pos). Den kaster en
//UgyldigListeIndeks hvis pos ikke er en posisjon i lenken. Den tillater å legge
//til og med på en stoerre enn stoerrelsen til lenken.
  public void leggTil (int pos, T x) throws UgyldigListeIndeks{
    //Teller brukes for å sammenligne mot pos
    int teller = 0;
    //plass brukes for å gå gjennom lenken.
    Node plass = start;
    //nyNeste brukes for å lagre referansen til den neste noden etter pos.
    Node nyNeste;

    //Sjekker om pos er innenfor lenken, og kaster en UgyldigListeIndeks dersom
    //den ikke er det.
    if (pos < 0  || pos > stoerrelse ()){
      throw new UgyldigListeIndeks (pos);
    }

    //Passer på at den legges inn riktig dersom pos er starten av lenken.
    if (pos == 0){
      if (plass == null){
        leggTil(x);
      }
      else {
        start = new Node (x);
        start.neste = plass;
      }
    }

    //traverserer gjennom lenken.
    else{
      while (teller < pos-1){
        plass = plass.neste;
        teller++;
      }
      //Tar vare på neste node i nyNeste.
      nyNeste = plass.neste;
      //Lager den nye noden på plassen.
      plass.neste = new Node (x);
      //Endrer plass til den nye noden.
      plass = plass.neste;
      //Lagrer referansen til den neste noden i kjeden.
      plass.neste = nyNeste;
    }
  }

//Endrer en node på pos.
  public void sett (int pos, T x) throws UgyldigListeIndeks{
    //Teller brukes for å sammenligne mot pos
    int teller = 0;
    //plass brukes for å gå gjennom lenken.
    Node plass = start;

    //Sjekker at pos er innenfor lenken. Kaster UgyldigListeIndeks dersom den
    //ikke er det.
    if (pos >= stoerrelse() || stoerrelse() == 0 || pos < 0){
      throw new UgyldigListeIndeks (pos);
    }

    //Prøver å endre data hos noden på posisjon pos.
    while (teller < pos){
      plass = plass.neste;
      teller++;
    }
    plass.data = x;
  }

//Fjerner den første noden i lenken og returnerer objektet.
  public T fjern () {
    //Sjekker om listen er tom, og kaster UgyldigListeIndeks dersom den er det.
    if (start == null){
      throw new UgyldigListeIndeks (0);
    }

    //Lagrer den neste noden i lenken.
    Node nyStart = start.neste;
    //Lagrer returobjektet.
    T returnVerdi = start.data;

    start = nyStart;
    return returnVerdi;
  }

//Fjerner noden på posisjon og returnerer objektet der.
  public T fjern (int pos) throws UgyldigListeIndeks{
    //Teller brukes for å sammenligne mot pos
    int teller = 0;
    //plass brukes for å gå gjennom lenken.
    Node plass = start;
    //Oppretter returNode for å lagre hvilken node som skal retureneres.
    Node returNode;

    //Sjekker at pos er innenfor listen.
    if (pos >= stoerrelse() || stoerrelse() == 0 || pos < 0){
      throw new UgyldigListeIndeks (pos);
    }

    //traverserer gjennom lenken. Dersom pos er stoerre enn lenken kastes
    //UgyldigListeIndeks.
    //if-test for å ta seg av tilfeller der pos==0.
    if (pos == 0){
        start = plass.neste;
        return plass.data;
      }

    //traverserer gjennom lenken.
    while (teller < pos-1){
        plass = plass.neste;
        teller++;
      }
    //Lagrer referansen til noden som objektet skal retureneres fra.
    returNode = plass.neste;
    //Endrer referansen i den foregående noden til noden etter.
    plass.neste = returNode.neste;
    return returNode.data;

    }

//Henter objektet på pos uten å fjerne noden.
  public T hent(int pos) throws UgyldigListeIndeks{

    //Teller brukes for å sammenligne mot pos
    int teller = 0;
    //plass brukes for å gå gjennom lenken.
    Node plass = start;

    //Sjekker at pos er innenfor listen.
    if (pos >= stoerrelse() || stoerrelse() == 0 || pos < 0){
      throw new UgyldigListeIndeks (pos);
    }

    //Henter objektet.
    while (teller != pos){
      plass = plass.neste;
      teller++;
    }
    return plass.data;
  }

//Returnerer størrelsen på lenken.obs, returnerer antall noder, ikke
//antall noder-1
  public int stoerrelse (){
    int stoerrelse = 1;
    Node teller = start;
    if (teller == null){
      return 0;
    }
    while (teller.neste != null){
      teller = teller.neste;
      stoerrelse++;
    }
    return stoerrelse;
  }
}
