package ex2Lista2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> listadelivros = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public Biblioteca(String nome, List<Livro> listadelivros) {
        this.nome = nome;
        this.listadelivros = listadelivros;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getListadelivros() {
        return listadelivros;
    }

    public void adicionarLivro(Livro livro) {
        this.listadelivros.add(livro);
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : this.listadelivros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro buscarLivro(String titulo, String autor) {
        for (Livro livro : this.listadelivros) {
            if (livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor)) {
                return livro;
            }
        }
        return null;
    }

}
