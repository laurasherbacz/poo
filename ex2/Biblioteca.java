package ex2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> listadeLivros = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
        this.listadeLivros = listadeLivros;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getListadeLivros() {
        return listadeLivros;
    }

    public void adicionarLivro(Livro livro) {
        this.listadeLivros.add(livro);
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : listadeLivros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;

            }
        }
        return null;
    }

    public Livro buscarLivro(String titulo, String autor) {
        for (Livro livro : listadeLivros) {
            if (livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor)) {
                return livro;
            }
        }
        return null;
    }
}
