//Klassen  oppbevarer navnet på leger.

class Lege {

  protected String navn;

  //Tar imot navnet på legen (n).
  public Lege (String n){
    navn = n;
  }


  //Metode som returnerer navnet til legen.
  public String hentNavn(){
    return navn;
  }

  public String toString(){
    return "Legen heter " + navn + ".";
  }
}
