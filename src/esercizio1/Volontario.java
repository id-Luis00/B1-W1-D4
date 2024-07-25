package esercizio1;

public class Volontario implements Check {

    private String nome;
    private int eta;
    private String CV;

    public Volontario(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCV() {
        return CV;
    }


    @Override
    public void checkIn() {
        System.out.println("turno di " + this.nome + " iniziato");
    }

    @Override
    public void checkOut() {
        System.out.println("\nturno di " + this.nome + " terminato");
    }
}
