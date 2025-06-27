package ex2Lista2;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", "JK Rollins");
        Livro livro2 = new Livro("Senhor dos aneis", "Touki");

        Biblioteca biblioteca = new Biblioteca("Biblioteca da Laura");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Livro buscarLivroPeloTitutlo = biblioteca.buscarLivro("Harry Potter");
        if (buscarLivroPeloTitutlo != null) {
            System.out.println(buscarLivroPeloTitutlo.getAutor());
            System.out.println(buscarLivroPeloTitutlo.getTitulo());
        } else {
            System.out.println("Livro não encontrado");
        }

        System.out.println("--------------------------------------");

        Livro buscarLivroPeloTituloEPeloAutor = biblioteca.buscarLivro("Senhor dos aneis", "Touki");
        if (buscarLivroPeloTituloEPeloAutor != null) {
            System.out.println(buscarLivroPeloTituloEPeloAutor.getAutor());
            System.out.println(buscarLivroPeloTituloEPeloAutor.getTitulo());
        } else {
            System.out.println("Livro não encontrado");
        }
    }
}
