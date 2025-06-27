package ex1;

public class Sala {
    private String nome;
    private String capacidade;

    public Sala (String nome, String capacidade){
        this.nome= nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCapacidade() {
        return capacidade;
    }
}
