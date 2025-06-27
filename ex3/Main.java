package ex3Lista2;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("POO", "POO003", "Eveeton");
        Disciplina disciplina2 = new Disciplina("PW", "PW004", "Pablo");
        Disciplina disciplina3 = new Disciplina("Física", "FIS009", "Andresa");

        Curso curso = new Curso("Técnico em Informática");
        curso.setCargaHoraria(30600);
        curso.adicionarDisciplina(disciplina1);
        curso.adicionarDisciplina(disciplina2);
        curso.adicionarDisciplina(disciplina3);

        curso.mostrarResumoDoCurso();
    }
}