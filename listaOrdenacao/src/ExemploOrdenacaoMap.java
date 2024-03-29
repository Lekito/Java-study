import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {

    /**
     * Dada as seguites informações sobre meus livros favoritos e seus autores,
     * crie um dicionário e ordene este dicionário:
     * exibindo (Nome Autor - Nome Livro);
     */
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t---");
        Map<String, Livro> meusLivros = new HashMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma breve História do Tempo", 256));
                put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            }
        };

        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t---");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma breve História do Tempo", 256));
                put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética autores\t---");
        Map<String, Livro> meusLivros2 = new TreeMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma breve História do Tempo", 256));
                put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética nomes dos livros\t---");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("----------------------------------------------------------------------------");
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return " nome  " +
                nome +
                ", paginas  " +
                paginas;
    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}