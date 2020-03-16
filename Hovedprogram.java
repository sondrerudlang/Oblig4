//Programmet kjører en minimal integrasjonstest, dvs. opprette en instans av alle
//objekter, og skrive ut informasjonen om disse.

class Hovedprogram{

  public static void main (String [] arg){

    //Oppretter fire legemiddelobjekter, minimum en av hver type.
    Narkotisk k = new Narkotisk ("kokain", 60.8, 100, 5);
    Vanedannende v = new Vanedannende ("valium", 15, 23, 2);
    Vanlig para = new Vanlig ("paracet", 12, 3);
    Vanlig ppille = new Vanlig ("P pille", 128, 60);

   //Skriver ut informasjon om hvert av objektene.
   System.out.println("Naa skrives ut infomasjon om fire legemidler.");

   System.out.println(k);
   System.out.println("Den narkotiske styrken er " + k.hentNarkotiskStyrke() + ".");
   System.out.println();

   System.out.println(v);
   System.out.println("Den vanedannende styrken er " + v.hentVanedannendeStyrke() + ".");
   System.out.println();

   System.out.println(para);
   System.out.println();

   System.out.println(ppille);
   System.out.println();

   //Oppretter to leger, en av dem er spesialist.
   Lege knut = new Lege ("Knut Knudsen");
   Spesialist ivar = new Spesialist ("Ivar Aasen", 56);

   //Skriver ut informasjon om legene.
   System.out.println("Naa skrives ut informasjon om to leger, en av dem er spesialist.");
   System.out.println(knut);
   System.out.println(ivar);
   System.out.println();

   //Oppretter fire resepter, en av hver type.

   Pasient pasient1 = new Pasient("Ove", 101297);
   Pasient pasient2 = new Pasient("Karl", 220586);
   Pasient pasient3 = new Pasient("Petter", 150679);
   Pasient pasient4 = new Pasient("Per", 190789);



   HvitResept hvit = new HvitResept (para, knut, pasient1, 2);
   MilitaerResept militaer = new MilitaerResept (v, ivar, pasient2, 6);
   PResept prevensjon = new PResept (ppille, knut, pasient3);
   BlaaResept blaa = new BlaaResept  (k, ivar, pasient4, 7);

   System.out.println(pasient1.hentAlleResepter());


   //Skriver ut informasjon om hver av reseptene.
   System.out.println("Naa skrives ut unformasjon om fire resepter.");
   System.out.println(hvit);
   System.out.println();
   System.out.println(militaer);
   System.out.println();
   System.out.println(prevensjon);
   System.out.println();
   System.out.println(blaa);
   System.out.println();
  }
}
