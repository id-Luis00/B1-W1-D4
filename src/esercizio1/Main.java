package esercizio1;

public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente(1200.00,"ED2306",Dipartimenti.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(2370.00, "LO6234", Dipartimenti.VENDITE);
        Dipendente dipendente3 = new Dipendente(3660.00, "JG6123", Dipartimenti.AMMINISTRAZIONE);


        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};
        for (int i=0; i < dipendenti.length; i++) {
            System.out.println("dipendente numero " + (i+1) + " : " + dipendenti[i].getMatricola());;
        }








    }
}
