package ex1Lista2;

public class Reserva {
    private String data;
    private String solicitante;
    private Sala sala;

    public Reserva(Sala sala) {
        this.sala = sala;
    }

    public Reserva(String data, String solicitante, Sala sala) {
        this.data = data;
        this.solicitante = solicitante;
        this.sala = sala;
    }

    public String getData() {
        return data;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public Sala getSala() {
        return sala;
    }

    public void gerarResumo() {
        System.out.println("Informações da Reserva:");
        System.out.println("Solicitante: " + solicitante);
        System.out.println("Data: " + data);
        this.getSala().exibirinformacoes();

    }

    public void setAlterarsocilicitante(String solicitante) {
        this.solicitante = solicitante;
    }
}
