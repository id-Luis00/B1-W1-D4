package esercizio1;

public class Dipendente {

    private String matricola;
    private double stipendio;
    private Dipartimenti dipartimento;

    public Dipendente(double stipendio, String matricola, Dipartimenti dipartimento) {
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

    @Override
    public String toString() {
        return "Dipendente{" +
                "\n matricola='" + matricola + '\'' +
                "\n stipendio=" + stipendio +
                "\n dipartimento=" + dipartimento +
                '}';
    }
}
