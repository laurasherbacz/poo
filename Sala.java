package ex1Lista2;

public class Sala {
    private String nome;
    private int capacidade;

    public Sala(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void exibirinformacoes() {
        System.out.println("Informações da Sala:");
        System.out.println("Nome da sala " + nome);
        System.out.println("Capacidade: " + capacidade);
    }
}
