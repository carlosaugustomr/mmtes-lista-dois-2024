
import java.util.ArrayList;
import java.util.List;

public class LivroMain {
    private List<Livros> livros = new ArrayList<>();

    public static void main(String[] args) {
        LivroMain livroMain = new LivroMain();
        livroMain.addLivro("Clean Code", "Robert C. Martin", 2008, 8, 15);
        livroMain.addLivro("Effective Java", "Joshua Bloch", 2001, 5, 28);

        for (Livros livro : livroMain.getLivros()) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Lançamento: " + livro.getLanccamentoDia() + "/" + livro.getLanccamentoMes() + "/"
                    + livro.getLanccamentoAno());
            System.out.println("Nome do livro: " + livro.getNomeDoLivro());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println("País: " + livro.getPais());
            System.out.println("Língua: " + livro.getLingua());
            System.out.println("-----------------------------");
        }
    }

    public void addLivro(String titulo, String autor, int lanccamentoAno, int lanccamentoMes, int lanccamentoDia) {
        Livros livro = new Livros(titulo, autor, lanccamentoAno, lanccamentoMes, lanccamentoDia);
        livros.add(livro);
    }

    public List<Livros> getLivros() {
        return livros;
    }
}