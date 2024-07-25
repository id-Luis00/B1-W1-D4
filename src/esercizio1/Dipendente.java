package esercizio1;

public abstract class  Dipendente implements Check{

    private String matricola;
    private double stipendio;
    private Dipartimenti dipartimento;

    public  Dipendente(double stipendio, String matricola, Dipartimenti dipartimento) {
        this.stipendio = stipendio;
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimenti getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimenti dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Dipendente{" +
                "\n matricola='" + matricola + '\'' +
                "\n stipendio=" + stipendio +
                "\n dipartimento=" + dipartimento +
                '}';
    }

    @Override
    public void checkIn() {
        System.out.println("\nturno di " + this.matricola + " iniziato");
    }

    @Override
    public void checkOut() {
        System.out.println("\nturno di " + this.matricola + " terminato");
    }
}
