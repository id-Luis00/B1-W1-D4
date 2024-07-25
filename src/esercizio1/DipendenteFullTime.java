package esercizio1;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(double stipendio, String matricola, Dipartimenti dipartimento) {
        super(stipendio, matricola, dipartimento);
    }

    @Override
    public double calculateSalary() {
       return getStipendio();
    }
}
