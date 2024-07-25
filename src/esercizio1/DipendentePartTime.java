package esercizio1;

public class DipendentePartTime extends Dipendente{

    private int OreDiLavoro;
    private int TariffaOraria = 10;

    public DipendentePartTime(double stipendio, String matricola, Dipartimenti dipartimento, int oreDiLavoro) {
        super(stipendio, matricola, dipartimento);
        this.OreDiLavoro = oreDiLavoro;
    }

    public int getOreDiLavoro() {
        return OreDiLavoro;
    }

    public int getTariffaOraria() {
        return TariffaOraria;
    }

    @Override
    public double calculateSalary() {
        int salary = this.TariffaOraria * this.OreDiLavoro;
        return salary;

    }
}
