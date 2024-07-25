package esercizio1;

public class Dirigente extends Dipendente{



    public Dirigente(double stipendio, String matricola, Dipartimenti dipartimento) {
        super(stipendio, matricola, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }
}
