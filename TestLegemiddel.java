class TestLegemiddel {
  public static void main (String [] arg){

    System.out.println("Det vil naa opprettes et narkotisk stoff, og skrive ut" +
    "informasjon om det. Deretter setter det ny pris, og printer ut ny pris.");

    //Oppretter nytt narkotisk legemiddel og skriver ut info om det.
    Narkotisk k = new Narkotisk ("kokain", 60.8, 100, 5);

    System.out.println(k.toString());
    System.out.println("Den narkotiske styrken er " + k.hentNarkotiskStyrke() + ".");
    k.settNyPris(300);
    System.out.println("Ny pris er " + k.hentPris() + ".");

    System.out.println("Det vil naa opprettes et vanedannende stoff, og skrive ut" +
    "informasjon om det. Deretter setter det ny pris, og printer ut ny pris.");
    Vanedannende v = new Vanedannende ("valium", 15, 23, 2);
    System.out.println(v.toString());
    System.out.println("Den vanedannende styrken er " + v.hentVanedannendeStyrke() + ".");
    v.settNyPris(300);
    System.out.println("Ny pris er " + v.hentPris() + ".");

    System.out.println("Det vil naa opprettes et vanlig stoff, og skrive ut" +
    "informasjon om det. Deretter setter det ny pris, og printer ut ny pris.");
    Vanlig para = new Vanlig ("paracet", 12, 3);
    System.out.println(para.toString());
    para.settNyPris(300);
    System.out.println("Ny pris er " + para.hentPris() + ".");
  }
}
