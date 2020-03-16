import java.util.ArrayList;

public class Pasient {
  public String navn;
  public long fødselsnummer;
  public static int counter;
  public int ID = 1;
  Stabel<Resept> resepter= new Stabel<Resept>();
//  public ArrayList<Resept> AlleResepter;


  public Pasient(String n, long f) {
    navn = n;
    fødselsnummer = f;
    counter++;
    ID = counter;

//    resepter = new Stabel<Resept>();
//    this.resepter.leggPaa();
  }

  public void leggPaa(Resept x){
    this.resepter.leggTil(x);
  }

  public Stabel<Resept> hentAlleResepter(){
    return this.resepter;
  }

/*
  public String hentAlleResepter(Resept x) {
    this.resepter.leggTil(x);


    /*
    alleResepter = new ArrayList<Resept>();
    for (int i = 0; i < resepter.stoerrelse(); i++) {
      alleResepter.add(resepter.hent(i));
    }

    //return alleResepter;
  }*/
}
