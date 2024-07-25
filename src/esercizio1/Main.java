package esercizio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

 //       Dipendente dipendente1 = new Dipendente(1200.00,"ED2306",Dipartimenti.PRODUZIONE);
 //       Dipendente dipendente2 = new Dipendente(2370.00, "LO6234", Dipartimenti.VENDITE);
 //       Dipendente dipendente3 = new Dipendente(3660.00, "JG6123", Dipartimenti.AMMINISTRAZIONE);


  //      Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};
  //      for (int i=0; i < dipendenti.length; i++) {
  //          System.out.println("dipendente numero " + (i+1) + " : " + dipendenti[i].getMatricola());;
  //      }


        DipendentePartTime L = new DipendentePartTime(1200, "EL2306", Dipartimenti.PRODUZIONE, 20);
        DipendentePartTime L2 = new DipendentePartTime(1200, "EL2854", Dipartimenti.PRODUZIONE, 36 );
        DipendentePartTime L3 = new DipendentePartTime(1200, "EL2362", Dipartimenti.PRODUZIONE, 42);

        System.out.println("\nla paga oraria è di " + L.getTariffaOraria() + "€ e lei ha lavorato " + L.getOreDiLavoro() + " ore");
        System.out.println("il suo stipendio è di: €" + L.calculateSalary());;


        DipendenteFullTime M= new DipendenteFullTime(2400, "MR1456", Dipartimenti.VENDITE);
        DipendenteFullTime M2 = new DipendenteFullTime(2400, "MR1745", Dipartimenti.VENDITE);
        DipendenteFullTime M3 = new DipendenteFullTime(2400, "MR1579", Dipartimenti.VENDITE);
        System.out.println("\nStipendio di Marco €" + M.calculateSalary());

        Dirigente R = new Dirigente(6700, "XX6663", Dipartimenti.AMMINISTRAZIONE);
        Dirigente R2 = new Dirigente(6700, "XX6178", Dipartimenti.AMMINISTRAZIONE);
        Dirigente R3 = new Dirigente(6700, "XX6584", Dipartimenti.AMMINISTRAZIONE);
        System.out.println("\nStipendio di Riccardo €" + R.calculateSalary());

        Dipendente[] lavoratori = {L, L2, L3, M, M2, M3, R, R2, R3};


        double totStipendiPart = 0;
        double totStipendiFull = 0;
        double totStipendiDir = 0;

        for(Dipendente lavoratore : lavoratori) {

            if (lavoratore instanceof DipendentePartTime) {
                totStipendiPart += lavoratore.calculateSalary();
            } else if (lavoratore instanceof DipendenteFullTime) {
                totStipendiFull += lavoratore.calculateSalary();
            } else if (lavoratore instanceof Dirigente) {
                totStipendiDir += lavoratore.calculateSalary();
            }

        }

        System.out.println("\ntot part time €" + totStipendiPart);
        System.out.println("tot full €" + totStipendiFull);
        System.out.println("tot dir €" + totStipendiDir);


//        L.checkIn();
//        L.checkOut();

        String risposta = "";
//        System.out.println("\nVuoi iniziare un turno? ");
//        risposta = new Scanner(System.in).nextLine();
//
//        if(risposta.toLowerCase().equals("si")) {
//            System.out.println("qual è la tua matricola/nome? ");
//            for(Dipendente lavoratore : lavoratori) {
//                System.out.println(lavoratore.getMatricola());
//            }
//
//            String rispostaMat = new Scanner(System.in).nextLine();
//
//            for(Dipendente lavoratore : lavoratori) {
//                if (lavoratore.getMatricola().equals(rispostaMat)) {
//                    lavoratore.checkIn();
//                    break;
//                }
//            }
//
//        }


        while(true){
            System.out.println("\nVuoi iniziare un turno? (scrivere 'esc' per uscire)");
            risposta = new Scanner(System.in).nextLine();
            if (risposta.toLowerCase().equals("esc")) break;

            if (risposta.toLowerCase().equals("si")) {
                System.out.println("qual è la tua matricola/nome? (scrivere 'esc' per uscire)\n");

                for (Dipendente lavoratore : lavoratori) {
                    System.out.println(lavoratore.getMatricola());
                }

                String rispostaMat = new Scanner(System.in).nextLine();
                if (rispostaMat.equalsIgnoreCase("esc")) break;

                for (Dipendente lavoratore : lavoratori) {
                    if (lavoratore.getMatricola().equals(rispostaMat)) {
                        lavoratore.checkIn();
                        break;
                    }
                }

            }
        }


        Volontario v1 = new Volontario("Kayo", 25);








    }
}
