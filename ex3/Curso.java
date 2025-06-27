package ex3Lista2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private List<Disciplina> listadedisciplinas = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }


    public Curso(String nome, int cargaHoraria, List<Disciplina> listadedisciplinas) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.listadedisciplinas = listadedisciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.listadedisciplinas.add(disciplina);
    }

    public void mostrarResumoDoCurso() {
        System.out.println("=== Resumo do Curso ===");
        System.out.println("Nome: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Disciplinas:");

        for (Disciplina disciplina : listadedisciplinas) {
            System.out.println("  - " + disciplina);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Disciplina> getDisciplinas() {
        return listadedisciplinas;
    }
}
